package typings
package onesignalDashCordovaDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionID extends js.Object {
  var actionID: js.UndefOr[java.lang.String] = js.undefined
  var `type`: onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSActionType
}

object Anon_ActionID {
  @scala.inline
  def apply(
    `type`: onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSActionType,
    actionID: java.lang.String = null
  ): Anon_ActionID = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (actionID != null) __obj.updateDynamic("actionID")(actionID)
    __obj.asInstanceOf[Anon_ActionID]
  }
}

