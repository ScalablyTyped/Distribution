package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.AnonKOSSettingsKeyAutoPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneSignalBuilder extends js.Object {
  def endInit(): Unit
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, Unit]): OneSignalBuilder
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, Unit]): OneSignalBuilder
  def iOSSettings(settings: AnonKOSSettingsKeyAutoPrompt): OneSignalBuilder
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder
}

object OneSignalBuilder {
  @scala.inline
  def apply(
    endInit: () => Unit,
    handleNotificationOpened: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => OneSignalBuilder,
    handleNotificationReceived: js.Function1[/* json */ OSNotification, Unit] => OneSignalBuilder,
    iOSSettings: AnonKOSSettingsKeyAutoPrompt => OneSignalBuilder,
    inFocusDisplaying: OSDisplayType => OneSignalBuilder
  ): OneSignalBuilder = {
    val __obj = js.Dynamic.literal(endInit = js.Any.fromFunction0(endInit), handleNotificationOpened = js.Any.fromFunction1(handleNotificationOpened), handleNotificationReceived = js.Any.fromFunction1(handleNotificationReceived), iOSSettings = js.Any.fromFunction1(iOSSettings), inFocusDisplaying = js.Any.fromFunction1(inFocusDisplaying))
    __obj.asInstanceOf[OneSignalBuilder]
  }
}

