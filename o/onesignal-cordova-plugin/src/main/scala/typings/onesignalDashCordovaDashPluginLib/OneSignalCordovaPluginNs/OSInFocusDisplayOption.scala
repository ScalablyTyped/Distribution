package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OSInFocusDisplayOption extends js.Object

@JSGlobal("OneSignalCordovaPlugin.OSInFocusDisplayOption")
@js.native
object OSInFocusDisplayOption extends js.Object {
  @js.native
  sealed trait InAppAlert
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSInFocusDisplayOption
  
  @js.native
  sealed trait None
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSInFocusDisplayOption
  
  @js.native
  sealed trait Notification
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSInFocusDisplayOption
  
  /* 1 */ val InAppAlert: InAppAlert with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Notification: Notification with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSInFocusDisplayOption with scala.Double
  ] = js.native
}

