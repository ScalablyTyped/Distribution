package typings.onesignalDashCordovaDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var OneSignal: typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(OneSignal: typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

