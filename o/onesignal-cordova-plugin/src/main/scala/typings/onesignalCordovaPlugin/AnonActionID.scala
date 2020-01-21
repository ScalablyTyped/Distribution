package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionID extends js.Object {
  var actionID: js.UndefOr[String] = js.undefined
  var `type`: OSActionType
}

object AnonActionID {
  @scala.inline
  def apply(`type`: OSActionType, actionID: String = null): AnonActionID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actionID != null) __obj.updateDynamic("actionID")(actionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionID]
  }
}

