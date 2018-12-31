package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolCluster extends js.Object {
  var config: PoolClusterConfig = js.native
  def add(config: PoolConfig): scala.Unit = js.native
  def add(id: java.lang.String, config: PoolConfig): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(callback: js.Function1[/* err */ MysqlError, scala.Unit]): scala.Unit = js.native
  def getConnection(callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, scala.Unit]): scala.Unit = js.native
  def getConnection(
    pattern: java.lang.String,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, scala.Unit]
  ): scala.Unit = js.native
  def getConnection(
    pattern: java.lang.String,
    selector: java.lang.String,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, scala.Unit]
  ): scala.Unit = js.native
  def of(pattern: java.lang.String): Pool = js.native
  def of(pattern: java.lang.String, selector: java.lang.String): Pool = js.native
  def of(pattern: js.UndefOr[scala.Nothing], selector: java.lang.String): Pool = js.native
  def of(pattern: mysqlLib.mysqlLibNumbers.`false`, selector: java.lang.String): Pool = js.native
  def of(pattern: scala.Null, selector: java.lang.String): Pool = js.native
  def on(ev: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): PoolCluster = js.native
  @JSName("on")
  def on_offline(
    ev: mysqlLib.mysqlLibStrings.offline,
    callback: js.Function1[/* nodeId */ java.lang.String, scala.Unit]
  ): PoolCluster = js.native
  @JSName("on")
  def on_remove(
    ev: mysqlLib.mysqlLibStrings.remove,
    callback: js.Function1[/* nodeId */ java.lang.String, scala.Unit]
  ): PoolCluster = js.native
  /**
    * remove all pools which match pattern
    */
  def remove(pattern: java.lang.String): scala.Unit = js.native
}

