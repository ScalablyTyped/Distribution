package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorized extends js.Object {
  var Authorized: `1`
  var Denied: `2`
  var NotDetermined: `0`
}

object AnonAuthorized {
  @scala.inline
  def apply(Authorized: `1`, Denied: `2`, NotDetermined: `0`): AnonAuthorized = {
    val __obj = js.Dynamic.literal(Authorized = Authorized.asInstanceOf[js.Any], Denied = Denied.asInstanceOf[js.Any], NotDetermined = NotDetermined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorized]
  }
}

