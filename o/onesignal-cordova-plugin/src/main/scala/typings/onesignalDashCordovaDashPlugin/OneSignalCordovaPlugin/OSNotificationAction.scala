package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin

import typings.onesignalDashCordovaDashPlugin.onesignalDashCordovaDashPluginStrings.ActionTaken
import typings.onesignalDashCordovaDashPlugin.onesignalDashCordovaDashPluginStrings.Opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationAction extends js.Object {
  var actionID: String
  var `type`: Opened | ActionTaken
}

object OSNotificationAction {
  @scala.inline
  def apply(actionID: String, `type`: Opened | ActionTaken): OSNotificationAction = {
    val __obj = js.Dynamic.literal(actionID = actionID)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationAction]
  }
}

