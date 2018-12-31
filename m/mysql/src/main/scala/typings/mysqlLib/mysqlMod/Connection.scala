package typings
package mysqlLib.mysqlMod

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
  var state: mysqlLib.mysqlLibStrings.connected | mysqlLib.mysqlLibStrings.authenticated | mysqlLib.mysqlLibStrings.disconnected | mysqlLib.mysqlLibStrings.protocol_error | java.lang.String = js.native
  var threadId: scala.Double | scala.Null = js.native
  def beginTransaction(): scala.Unit = js.native
  def beginTransaction(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def beginTransaction(options: QueryOptions): scala.Unit = js.native
  def beginTransaction(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def changeUser(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def changeUser(options: ConnectionOptions): scala.Unit = js.native
  def changeUser(options: ConnectionOptions, callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def commit(): scala.Unit = js.native
  def commit(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def commit(options: QueryOptions): scala.Unit = js.native
  def commit(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def connect(): scala.Unit = js.native
  def connect(callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def connect(options: js.Any): scala.Unit = js.native
  def connect(options: js.Any, callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def createQuery(options: java.lang.String): Query = js.native
  def createQuery(options: java.lang.String, callback: queryCallback): Query = js.native
  def createQuery(options: java.lang.String, values: js.Any): Query = js.native
  def createQuery(options: java.lang.String, values: js.Any, callback: queryCallback): Query = js.native
  def createQuery(options: QueryOptions): Query = js.native
  def createQuery(options: QueryOptions, callback: queryCallback): Query = js.native
  def createQuery(query: Query): Query = js.native
  def destroy(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def end(options: js.Any, callback: js.Function2[/* err */ MysqlError, /* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(ev: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_connect(ev: mysqlLib.mysqlLibStrings.connect, callback: js.Function0[scala.Unit]): Connection = js.native
  @JSName("on")
  def on_drain(ev: mysqlLib.mysqlLibStrings.drain, callback: js.Function0[scala.Unit]): Connection = js.native
  @JSName("on")
  def on_end(
    ev: mysqlLib.mysqlLibStrings.end,
    callback: js.Function1[/* err */ js.UndefOr[MysqlError], scala.Unit]
  ): Connection = js.native
  @JSName("on")
  def on_enqueue(ev: mysqlLib.mysqlLibStrings.enqueue, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Connection = js.native
  @JSName("on")
  def on_error(ev: mysqlLib.mysqlLibStrings.error, callback: js.Function1[/* err */ MysqlError, scala.Unit]): Connection = js.native
  @JSName("on")
  def on_fields(ev: mysqlLib.mysqlLibStrings.fields, callback: js.Function1[/* fields */ js.Array[_], scala.Unit]): Connection = js.native
  def pause(): scala.Unit = js.native
  def ping(): scala.Unit = js.native
  def ping(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def ping(options: QueryOptions): scala.Unit = js.native
  def ping(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def query(options: java.lang.String): Query = js.native
  def query(options: java.lang.String, callback: queryCallback): Query = js.native
  def query(options: java.lang.String, values: js.Any): Query = js.native
  def query(options: java.lang.String, values: js.Any, callback: queryCallback): Query = js.native
  def query(options: QueryOptions): Query = js.native
  def query(options: QueryOptions, callback: queryCallback): Query = js.native
  def query(query: Query): Query = js.native
  def resume(): scala.Unit = js.native
  def rollback(): scala.Unit = js.native
  def rollback(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def rollback(options: QueryOptions): scala.Unit = js.native
  def rollback(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def statistics(): scala.Unit = js.native
  def statistics(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def statistics(options: QueryOptions): scala.Unit = js.native
  def statistics(options: QueryOptions, callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
}

