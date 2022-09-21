package typings.mysql.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool
  extends EventEmitter
     with EscapeFunctions {
  
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
  
  def query(options: String): Query = js.native
  def query(options: String, callback: queryCallback): Query = js.native
  def query(options: String, values: Any): Query = js.native
  def query(options: String, values: Any, callback: queryCallback): Query = js.native
  def query(options: QueryOptions): Query = js.native
  def query(options: QueryOptions, callback: queryCallback): Query = js.native
  def query(options: QueryOptions, values: Any): Query = js.native
  def query(options: QueryOptions, values: Any, callback: queryCallback): Query = js.native
  def query(query: Query): Query = js.native
  @JSName("query")
  var query_Original: QueryFunction = js.native
}
