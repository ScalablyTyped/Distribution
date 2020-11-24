package typings.mysql.mod

import typings.mysql.mysqlStrings.acquire
import typings.mysql.mysqlStrings.connection
import typings.mysql.mysqlStrings.enqueue
import typings.mysql.mysqlStrings.error
import typings.mysql.mysqlStrings.release
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool extends EscapeFunctions {
  
  def acquireConnection(
    connection: PoolConnection,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]
  ): Unit = js.native
  
  var config: PoolActualConfig = js.native
  
  /**
    * Close the connection. Any queued data (eg queries) will be sent first. If
    * there are any fatal errors, the connection will be immediately closed.
    * @param callback Handler for any fatal error
    */
  def end(): Unit = js.native
  def end(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  def getConnection(callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]): Unit = js.native
  
  /**
    * Set handler to be run on a certain event.
    */
  def on(ev: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Pool = js.native
  /**
    * Set handler to be run when a connection is acquired from the pool. This
    * is called after all acquiring activity has been performed on the
    * connection, right before the connection is handed to the callback of the
    * acquiring code.
    */
  // tslint:disable-next-line:unified-signatures
  @JSName("on")
  def on_acquire(ev: acquire, callback: js.Function1[/* connection */ PoolConnection, Unit]): Pool = js.native
  /**
    * Set handler to be run when a new connection is made within the pool.
    */
  @JSName("on")
  def on_connection(ev: connection, callback: js.Function1[/* connection */ PoolConnection, Unit]): Pool = js.native
  /**
    * Set handler to be run when a callback has been queued to wait for an
    * available connection.
    */
  @JSName("on")
  def on_enqueue(ev: enqueue, callback: js.Function1[/* err */ js.UndefOr[MysqlError], Unit]): Pool = js.native
  /**
    * Set handler to be run when a a fatal error occurs.
    */
  @JSName("on")
  def on_error(ev: error, callback: js.Function1[/* err */ MysqlError, Unit]): Pool = js.native
  /**
    * Set handler to be run when a connection is released back to the pool.
    * This is called after all release activity has been performed on the
    * connection, so the connection will be listed as free at the time of the
    * event.
    */
  // tslint:disable-next-line:unified-signatures
  @JSName("on")
  def on_release(ev: release, callback: js.Function1[/* connection */ PoolConnection, Unit]): Pool = js.native
  
  def query(options: String): Query = js.native
  def query(options: String, callback: queryCallback): Query = js.native
  def query(options: String, values: js.Any): Query = js.native
  def query(options: String, values: js.Any, callback: queryCallback): Query = js.native
  def query(options: QueryOptions): Query = js.native
  def query(options: QueryOptions, callback: queryCallback): Query = js.native
  def query(options: QueryOptions, values: js.Any): Query = js.native
  def query(options: QueryOptions, values: js.Any, callback: queryCallback): Query = js.native
  def query(query: Query): Query = js.native
  @JSName("query")
  var query_Original: QueryFunction = js.native
  
  def releaseConnection(connection: PoolConnection): Unit = js.native
}
