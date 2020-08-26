package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorized extends js.Object {
  var Authorized: `1` = js.native
  var Denied: `2` = js.native
  var NotDetermined: `0` = js.native
}

object Authorized {
  @scala.inline
  def apply(Authorized: `1`, Denied: `2`, NotDetermined: `0`): Authorized = {
    val __obj = js.Dynamic.literal(Authorized = Authorized.asInstanceOf[js.Any], Denied = Denied.asInstanceOf[js.Any], NotDetermined = NotDetermined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorized]
  }
  @scala.inline
  implicit class AuthorizedOps[Self <: Authorized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorized(value: `1`): Self = this.set("Authorized", value.asInstanceOf[js.Any])
    @scala.inline
    def setDenied(value: `2`): Self = this.set("Denied", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotDetermined(value: `0`): Self = this.set("NotDetermined", value.asInstanceOf[js.Any])
  }
  
}

