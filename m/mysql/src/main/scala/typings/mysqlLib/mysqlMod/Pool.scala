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
  def end(): scala.Unit = js.native
  def end(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def getConnection(callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, scala.Unit]): scala.Unit = js.native
  def on(ev: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Pool = js.native
  @JSName("on")
  def on_acquire(
    ev: mysqlLib.mysqlLibStrings.acquire,
    callback: js.Function1[/* connection */ PoolConnection, scala.Unit]
  ): Pool = js.native
  @JSName("on")
  def on_connection(
    ev: mysqlLib.mysqlLibStrings.connection,
    callback: js.Function1[/* connection */ PoolConnection, scala.Unit]
  ): Pool = js.native
  @JSName("on")
  def on_enqueue(
    ev: mysqlLib.mysqlLibStrings.enqueue,
    callback: js.Function1[/* err */ js.UndefOr[MysqlError], scala.Unit]
  ): Pool = js.native
  @JSName("on")
  def on_error(ev: mysqlLib.mysqlLibStrings.error, callback: js.Function1[/* err */ MysqlError, scala.Unit]): Pool = js.native
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

