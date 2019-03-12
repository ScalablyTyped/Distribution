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
    endInit: () => scala.Unit,
    handleNotificationOpened: js.Function1[/* json */ OSNotificationOpenedResult, scala.Unit] => OneSignalBuilder,
    handleNotificationReceived: js.Function1[/* json */ OSNotification, scala.Unit] => OneSignalBuilder,
    iOSSettings: onesignalDashCordovaDashPluginLib.Anon_KOSSettingsKeyAutoPrompt => OneSignalBuilder,
    inFocusDisplaying: OSDisplayType => OneSignalBuilder
  ): OneSignalBuilder = {
    val __obj = js.Dynamic.literal(endInit = js.Any.fromFunction0(endInit), handleNotificationOpened = js.Any.fromFunction1(handleNotificationOpened), handleNotificationReceived = js.Any.fromFunction1(handleNotificationReceived), iOSSettings = js.Any.fromFunction1(iOSSettings), inFocusDisplaying = js.Any.fromFunction1(inFocusDisplaying))
  
    __obj.asInstanceOf[OneSignalBuilder]
  }
}

