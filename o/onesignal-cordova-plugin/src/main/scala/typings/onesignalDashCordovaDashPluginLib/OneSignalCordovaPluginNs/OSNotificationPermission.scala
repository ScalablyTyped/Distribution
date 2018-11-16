package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OSNotificationPermission extends js.Object

@JSGlobal("OneSignalCordovaPlugin.OSNotificationPermission")
@js.native
object OSNotificationPermission extends js.Object {
  @js.native
  sealed trait Authorized
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSNotificationPermission
  
  @js.native
  sealed trait Denied
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSNotificationPermission
  
  @js.native
  sealed trait NotDetermined
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSNotificationPermission
  
  /* 1 */ val Authorized: Authorized with scala.Double = js.native
  /* 2 */ val Denied: Denied with scala.Double = js.native
  /* 0 */ val NotDetermined: NotDetermined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSNotificationPermission with scala.Double
  ] = js.native
}

