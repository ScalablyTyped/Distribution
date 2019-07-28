package typings.mysql.mysqlMod

import typings.mysql.mysqlStrings.authenticated
import typings.mysql.mysqlStrings.connect
import typings.mysql.mysqlStrings.connected
import typings.mysql.mysqlStrings.disconnected
import typings.mysql.mysqlStrings.drain
import typings.mysql.mysqlStrings.end
import typings.mysql.mysqlStrings.enqueue
import typings.mysql.mysqlStrings.error
import typings.mysql.mysqlStrings.fields
import typings.mysql.mysqlStrings.protocol_error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends EscapeFunctions {
  var config: ConnectionConfig = js.native
  @JSName("createQuery")
  var createQuery_Original: QueryFunction = js.native
  @JSName("query")
  var query_Original: QueryFunction = js.native
  var state: connected | authenticated | disconnected | protocol_error | String = js.native
  var threadId: Double | Null = js.native
  def beginTransaction(): Unit = js.native
  def beginTransaction(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def beginTransaction(options: QueryOptions): Unit = js.native
  def beginTransaction(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def changeUser(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def changeUser(options: ConnectionOptions): Unit = js.native
  def changeUser(options: ConnectionOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def commit(): Unit = js.native
  def commit(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def commit(options: QueryOptions): Unit = js.native
  def commit(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def connect(): Unit = js.native
  def connect(callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, Unit]): Unit = js.native
  def connect(options: js.Any): Unit = js.native
  def connect(options: js.Any, callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, Unit]): Unit = js.native
  def createQuery(options: String): Query = js.native
  def createQuery(options: String, callback: queryCallback): Query = js.native
  def createQuery(options: String, values: js.Any): Query = js.native
  def createQuery(options: String, values: js.Any, callback: queryCallback): Query = js.native
  def createQuery(options: QueryOptions): Query = js.native
  def createQuery(options: QueryOptions, callback: queryCallback): Query = js.native
  def createQuery(query: Query): Query = js.native
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
  def end(callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, Unit]): Unit = js.native
  def end(options: js.Any, callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, Unit]): Unit = js.native
  /**
    * Set handler to be run on a certain event.
    */
  def on(ev: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Connection = js.native
  @JSName("on")
  def on_connect(ev: connect, callback: js.Function0[Unit]): Connection = js.native
  @JSName("on")
  def on_drain(ev: drain, callback: js.Function0[Unit]): Connection = js.native
  /**
    * Set handler to be run when the connection is closed.
    */
  @JSName("on")
  def on_end(ev: end, callback: js.Function1[/* err */ js.UndefOr[MysqlError], Unit]): Connection = js.native
  /**
    * Set handler to be run when a callback has been queued to wait for an
    * available connection.
    */
  // tslint:disable-next-line:unified-signatures
  @JSName("on")
  def on_enqueue(ev: enqueue, callback: js.Function1[/* err */ js.UndefOr[MysqlError], Unit]): Connection = js.native
  /**
    * Set handler to be run when a a fatal error occurs.
    */
  @JSName("on")
  def on_error(ev: error, callback: js.Function1[/* err */ MysqlError, Unit]): Connection = js.native
  @JSName("on")
  def on_fields(ev: fields, callback: js.Function1[/* fields */ js.Array[_], Unit]): Connection = js.native
  /**
    * Pause the connection. No more 'result' events will fire until resume() is
    * called.
    */
  def pause(): Unit = js.native
  def ping(): Unit = js.native
  def ping(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def ping(options: QueryOptions): Unit = js.native
  def ping(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def query(options: String): Query = js.native
  def query(options: String, callback: queryCallback): Query = js.native
  def query(options: String, values: js.Any): Query = js.native
  def query(options: String, values: js.Any, callback: queryCallback): Query = js.native
  def query(options: QueryOptions): Query = js.native
  def query(options: QueryOptions, callback: queryCallback): Query = js.native
  def query(query: Query): Query = js.native
  /**
    * Resume the connection.
    */
  def resume(): Unit = js.native
  def rollback(): Unit = js.native
  def rollback(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def rollback(options: QueryOptions): Unit = js.native
  def rollback(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def statistics(): Unit = js.native
  def statistics(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def statistics(options: QueryOptions): Unit = js.native
  def statistics(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
}

