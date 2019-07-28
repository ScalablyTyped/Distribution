package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OneSignalCordovaPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var OneSignal: OneSignalCordovaPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(OneSignal: OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

