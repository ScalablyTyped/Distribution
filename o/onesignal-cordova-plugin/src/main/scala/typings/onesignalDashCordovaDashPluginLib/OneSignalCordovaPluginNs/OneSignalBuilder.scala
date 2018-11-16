package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OneSignalBuilder extends js.Object {
  def endInit(): scala.Unit
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, scala.Unit]): OneSignalBuilder
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, scala.Unit]): OneSignalBuilder
  def iOSSettings(settings: onesignalDashCordovaDashPluginLib.Anon_KOSSettingsKeyInAppLaunchURL): OneSignalBuilder
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder
}

