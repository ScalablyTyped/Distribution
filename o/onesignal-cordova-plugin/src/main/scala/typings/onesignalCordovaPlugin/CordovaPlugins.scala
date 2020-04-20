package typings.onesignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var OneSignal: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(OneSignal: typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
}

