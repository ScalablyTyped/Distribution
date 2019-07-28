package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSActionType
import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSDisplayType
import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSInFocusDisplayOption
import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSLockScreenVisibility
import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSNotificationPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object onesignalDashCordovaDashPluginNumbers {
  @js.native
  sealed trait `-1` extends OSLockScreenVisibility
  
  @js.native
  sealed trait `0`
    extends OSActionType
       with OSDisplayType
       with OSInFocusDisplayOption
       with OSLockScreenVisibility
       with OSNotificationPermission
  
  @js.native
  sealed trait `1`
    extends OSActionType
       with OSDisplayType
       with OSInFocusDisplayOption
       with OSLockScreenVisibility
       with OSNotificationPermission
  
  @js.native
  sealed trait `2`
    extends OSDisplayType
       with OSInFocusDisplayOption
       with OSNotificationPermission
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
}

