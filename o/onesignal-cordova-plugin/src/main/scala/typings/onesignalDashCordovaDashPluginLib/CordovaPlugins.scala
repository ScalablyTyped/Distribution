package typings
package onesignalDashCordovaDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var OneSignal: onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OneSignalCordovaPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(OneSignal: onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OneSignal")(OneSignal)
    __obj.asInstanceOf[CordovaPlugins]
  }
}

