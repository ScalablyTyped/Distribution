package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneSignalBuilder extends js.Object {
  def endInit(): scala.Unit
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, scala.Unit]): OneSignalBuilder
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, scala.Unit]): OneSignalBuilder
  def iOSSettings(settings: onesignalDashCordovaDashPluginLib.Anon_KOSSettingsKeyAutoPrompt): OneSignalBuilder
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder
}

object OneSignalBuilder {
  @scala.inline
  def apply(
    endInit: js.Function0[scala.Unit],
    handleNotificationOpened: js.Function1[js.Function1[/* json */ OSNotificationOpenedResult, scala.Unit], OneSignalBuilder],
    handleNotificationReceived: js.Function1[js.Function1[/* json */ OSNotification, scala.Unit], OneSignalBuilder],
    iOSSettings: js.Function1[onesignalDashCordovaDashPluginLib.Anon_KOSSettingsKeyAutoPrompt, OneSignalBuilder],
    inFocusDisplaying: js.Function1[OSDisplayType, OneSignalBuilder]
  ): OneSignalBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endInit")(endInit)
    __obj.updateDynamic("handleNotificationOpened")(handleNotificationOpened)
    __obj.updateDynamic("handleNotificationReceived")(handleNotificationReceived)
    __obj.updateDynamic("iOSSettings")(iOSSettings)
    __obj.updateDynamic("inFocusDisplaying")(inFocusDisplaying)
    __obj.asInstanceOf[OneSignalBuilder]
  }
}

