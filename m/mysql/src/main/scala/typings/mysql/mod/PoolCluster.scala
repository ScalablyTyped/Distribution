package typings.mysql.mod

import typings.mysql.mysqlBooleans.`false`
import typings.mysql.mysqlStrings.offline
import typings.mysql.mysqlStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolCluster extends js.Object {
  var config: PoolClusterConfig = js.native
  def add(config: PoolConfig): Unit = js.native
  def add(id: String, config: PoolConfig): Unit = js.native
  /**
    * Close the connection. Any queued data (eg queries) will be sent first. If
    * there are any fatal errors, the connection will be immediately closed.
    * @param callback Handler for any fatal error
    */
  def end(): Unit = js.native
  def end(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  def getConnection(callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]): Unit = js.native
  def getConnection(
    pattern: String,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]
  ): Unit = js.native
  def getConnection(
    pattern: String,
    selector: String,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]
  ): Unit = js.native
  def of(pattern: js.UndefOr[scala.Nothing], selector: String): Pool = js.native
  def of(pattern: String): Pool = js.native
  def of(pattern: String, selector: String): Pool = js.native
  def of(pattern: Null, selector: String): Pool = js.native
  @JSName("of")
  def of_false(pattern: `false`, selector: String): Pool = js.native
  /**
    * Set handler to be run on a certain event.
    */
  def on(ev: String, callback: js.Function1[/* repeated */ js.Any, Unit]): PoolCluster = js.native
  @JSName("on")
  def on_offline(ev: offline, callback: js.Function1[/* nodeId */ String, Unit]): PoolCluster = js.native
  /**
    * Set handler to be run when a node is removed or goes offline.
    */
  @JSName("on")
  def on_remove(ev: remove, callback: js.Function1[/* nodeId */ String, Unit]): PoolCluster = js.native
  /**
    * remove all pools which match pattern
    */
  def remove(pattern: String): Unit = js.native
}

