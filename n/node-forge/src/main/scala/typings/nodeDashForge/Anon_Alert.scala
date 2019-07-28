package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.Verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends Verified {
  var alert: js.UndefOr[Description] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Anon_Alert {
  @scala.inline
  def apply(alert: Description = null, message: String = null): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Alert]
  }
}

