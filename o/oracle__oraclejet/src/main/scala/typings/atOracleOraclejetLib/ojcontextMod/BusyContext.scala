package typings
package atOracleOraclejetLib.ojcontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusyContext extends js.Object {
  def addBusyState(options: atOracleOraclejetLib.Anon_Description): js.Function0[scala.Unit] = js.native
  def applicationBootstrapComplete(): js.UndefOr[scala.Nothing] = js.native
  def clear(): js.UndefOr[scala.Nothing] = js.native
  def dump(): js.UndefOr[scala.Nothing] = js.native
  def dump(message: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def getBusyStates(): js.Array[atOracleOraclejetLib.Anon_DescriptionId] = js.native
  def isReady(): scala.Boolean = js.native
  def whenReady(): js.Promise[scala.Boolean | stdLib.Error] = js.native
  def whenReady(timeout: scala.Double): js.Promise[scala.Boolean | stdLib.Error] = js.native
}

