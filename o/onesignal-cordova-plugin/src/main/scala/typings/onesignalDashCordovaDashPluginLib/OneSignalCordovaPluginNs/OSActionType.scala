package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OSActionType extends js.Object

@JSGlobal("OneSignalCordovaPlugin.OSActionType")
@js.native
object OSActionType extends js.Object {
  @js.native
  sealed trait ActionTake
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSActionType
  
  @js.native
  sealed trait Opened
    extends onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSActionType
  
  /* 1 */ val ActionTake: ActionTake with scala.Double = js.native
  /* 0 */ val Opened: Opened with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs.OSActionType with scala.Double
  ] = js.native
}

