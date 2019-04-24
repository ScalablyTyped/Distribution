package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool extends EscapeFunctions {
  var config: PoolConfig = js.native
  @JSName("query")
  var query_Original: QueryFunction = js.native
  def acquireConnection(
    connection: PoolConnection,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Close the connection. Any queued data (eg queries) will be sent first. If
    * there are any fatal errors, the connection will be immediately closed.
    * @param callback Handler for any fatal error
    */
  def end(): scala.Unit = js.native
  def end(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def getConnection(callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, scala.Unit]): scala.Unit = js.native
  /**
    * Set handler to be run on a certain event.
    */
  def on(ev: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Pool = js.native
  /**
    * Set handler to be run when a connection is acquired from the pool. This
    * is called after all acquiring activity has been performed on the
    * connection, right before the connection is handed to the callback of the
    * acquiring code.
    */
  // tslint:disable-next-line:unified-signatures
  @JSName("on")
  def on_acquire(
    ev: mysqlLib.mysqlLibStrings.acquire,
    callback: js.Function1[/* connection */ PoolConnection, scala.Unit]
  ): Pool = js.native
  /**
    * Set handler to be run when a new connection is made within the pool.
    */
  @JSName("on")
  def on_connection(
    ev: mysqlLib.mysqlLibStrings.connection,
    callback: js.Function1[/* connection */ PoolConnection, scala.Unit]
  ): Pool = js.native
  /**
    * Set handler to be run when a callback has been queued to wait for an
    * available connection.
    */
  @JSName("on")
  def on_enqueue(
    ev: mysqlLib.mysqlLibStrings.enqueue,
    callback: js.Function1[/* err */ js.UndefOr[MysqlError], scala.Unit]
  ): Pool = js.native
  /**
    * Set handler to be run when a a fatal error occurs.
    */
  @JSName("on")
  def on_error(ev: mysqlLib.mysqlLibStrings.error, callback: js.Function1[/* err */ MysqlError, scala.Unit]): Pool = js.native
  /**
    * Set handler to be run when a connection is released back to the pool.
    * This is called after all release activity has been performed on the
    * connection, so the connection will be listed as free at the time of the
    * event.
    */
  // tslint:disable-next-line:unified-signatures
  @JSName("on")
  def on_release(
    ev: mysqlLib.mysqlLibStrings.release,
    callback: js.Function1[/* connection */ PoolConnection, scala.Unit]
  ): Pool = js.native
  def query(options: java.lang.String): Query = js.native
  def query(options: java.lang.String, callback: queryCallback): Query = js.native
  def query(options: java.lang.String, values: js.Any): Query = js.native
  def query(options: java.lang.String, values: js.Any, callback: queryCallback): Query = js.native
  def query(options: QueryOptions): Query = js.native
  def query(options: QueryOptions, callback: queryCallback): Query = js.native
  def query(query: Query): Query = js.native
  def releaseConnection(connection: PoolConnection): scala.Unit = js.native
}

