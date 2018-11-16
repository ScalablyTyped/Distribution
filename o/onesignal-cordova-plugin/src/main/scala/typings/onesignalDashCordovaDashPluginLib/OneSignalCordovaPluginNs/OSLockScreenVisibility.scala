package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OSLockScreenVisibility extends js.Object

@JSGlobal("OneSignalCordovaPlugin.OSLockScreenVisibility")
@js.native
object OSLockScreenVisibility extends js.Object {
  @js.native
  sealed trait Private
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSLockScreenVisibility
  
  @js.native
  sealed trait Public
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSLockScreenVisibility
  
  @js.native
  sealed trait Secret
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSLockScreenVisibility
  
  /* 0 */ val Private: Private with scala.Double = js.native
  /* 1 */ val Public: Public with scala.Double = js.native
  /* -1 */ val Secret: Secret with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSLockScreenVisibility with scala.Double
  ] = js.native
}

