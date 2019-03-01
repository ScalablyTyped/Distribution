package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert
  extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.Verified {
  var alert: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Alert {
  @scala.inline
  def apply(
    alert: nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description = null,
    message: java.lang.String = null
  ): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Alert]
  }
}

