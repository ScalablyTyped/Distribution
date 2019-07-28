package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionID extends js.Object {
  var actionID: js.UndefOr[String] = js.undefined
  var `type`: OSActionType
}

object Anon_ActionID {
  @scala.inline
  def apply(`type`: OSActionType, actionID: String = null): Anon_ActionID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (actionID != null) __obj.updateDynamic("actionID")(actionID)
    __obj.asInstanceOf[Anon_ActionID]
  }
}

