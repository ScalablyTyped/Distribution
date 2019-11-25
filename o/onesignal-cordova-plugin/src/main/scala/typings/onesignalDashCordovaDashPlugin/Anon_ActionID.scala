package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OSActionType
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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actionID != null) __obj.updateDynamic("actionID")(actionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionID]
  }
}

