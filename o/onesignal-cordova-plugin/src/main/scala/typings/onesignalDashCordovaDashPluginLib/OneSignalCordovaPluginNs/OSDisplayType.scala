package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OSDisplayType extends js.Object

@JSGlobal("OneSignalCordovaPlugin.OSDisplayType")
@js.native
object OSDisplayType extends js.Object {
  @js.native
  sealed trait InAppAlert
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSDisplayType
  
  @js.native
  sealed trait None
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSDisplayType
  
  @js.native
  sealed trait Notification
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSDisplayType
  
  /* 1 */ val InAppAlert: InAppAlert with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Notification: Notification with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSDisplayType with scala.Double
  ] = js.native
}

