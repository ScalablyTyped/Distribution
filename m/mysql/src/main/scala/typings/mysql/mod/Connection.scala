package typings.mysql.mod

import typings.mysql.mysqlStrings.authenticated
import typings.mysql.mysqlStrings.connected
import typings.mysql.mysqlStrings.disconnected
import typings.mysql.mysqlStrings.protocol_error
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection
  extends EventEmitter
     with EscapeFunctions {
  
  def beginTransaction(): Unit = js.native
  def beginTransaction(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def beginTransaction(options: Unit, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def beginTransaction(options: QueryOptions): Unit = js.native
  def beginTransaction(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  def changeUser(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def changeUser(options: ConnectionOptions): Unit = js.native
  def changeUser(options: ConnectionOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  def commit(): Unit = js.native
  def commit(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def commit(options: Unit, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def commit(options: QueryOptions): Unit = js.native
  def commit(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  var config: ConnectionConfig = js.native
  
  def connect(): Unit = js.native
  def connect(callback: js.Function2[/* err */ MysqlError, /* repeated */ Any, Unit]): Unit = js.native
  def connect(options: Any): Unit = js.native
  def connect(options: Any, callback: js.Function2[/* err */ MysqlError, /* repeated */ Any, Unit]): Unit = js.native
  
  def createQuery(options: String): Query = js.native
  def createQuery(options: String, callback: queryCallback): Query = js.native
  def createQuery(options: String, values: Any): Query = js.native
  def createQuery(options: String, values: Any, callback: queryCallback): Query = js.native
  def createQuery(options: QueryOptions): Query = js.native
  def createQuery(options: QueryOptions, callback: queryCallback): Query = js.native
  def createQuery(options: QueryOptions, values: Any): Query = js.native
  def createQuery(options: QueryOptions, values: Any, callback: queryCallback): Query = js.native
  def createQuery(query: Query): Query = js.native
  @JSName("createQuery")
  var createQuery_Original: QueryFunction = js.native
  
  /**
    * Close the connection immediately, without waiting for any queued data (eg
    * queries) to be sent. No further events or callbacks will be triggered.
    */
  def destroy(): Unit = js.native
  
  /**
    * Close the connection. Any queued data (eg queries) will be sent first. If
    * there are any fatal errors, the connection will be immediately closed.
    * @param callback Handler for any fatal error
    */
  def end(): Unit = js.native
  def end(callback: js.Function1[/* err */ js.UndefOr[MysqlError], Unit]): Unit = js.native
  def end(options: Any, callback: js.Function1[/* err */ js.UndefOr[MysqlError], Unit]): Unit = js.native
  
  /**
    * Pause the connection. No more 'result' events will fire until resume() is
    * called.
    */
  def pause(): Unit = js.native
  
  def ping(): Unit = js.native
  def ping(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def ping(options: Unit, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def ping(options: QueryOptions): Unit = js.native
  def ping(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
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
  
  /**
    * Resume the connection.
    */
  def resume(): Unit = js.native
  
  def rollback(): Unit = js.native
  def rollback(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def rollback(options: Unit, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def rollback(options: QueryOptions): Unit = js.native
  def rollback(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  var state: connected | authenticated | disconnected | protocol_error | String = js.native
  
  def statistics(): Unit = js.native
  def statistics(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def statistics(options: Unit, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def statistics(options: QueryOptions): Unit = js.native
  def statistics(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  var threadId: Double | Null = js.native
}
