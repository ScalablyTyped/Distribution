package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Balance")
@js.native
abstract class Balance () extends js.Object {
  def fetchServer(
    balanceContext: nodeDashRalLib.nodeDashRalMod.BalanceNs.BalanceContextClass,
    conf: js.Any,
    prevBackend: Server
  ): Server = js.native
  def getCategory(): js.Any = js.native
  def getContextClass(): BalanceContextConstructor = js.native
}

/* static members */
@JSImport("node-ral", "Balance")
@js.native
object Balance extends js.Object {
  var BalanceContext: nodeDashRalLib.nodeDashRalMod.BalanceContextConstructor = js.native
}

