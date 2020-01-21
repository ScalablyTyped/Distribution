package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Android only
  */
/* Rewritten from type alias, can be one of: 
  - typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
  - typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
*/
trait OSNotificationPermissionState extends js.Object

object OSNotificationPermissionState {
  @scala.inline
  def Authorized: `1` = this.cast(1)
  @scala.inline
  def Denied: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

