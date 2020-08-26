package typings.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageOptions extends js.Object {
  var autoload: js.UndefOr[Boolean] = js.native
  var autologin: js.UndefOr[Boolean] = js.native
  var email: String = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var password: String = js.native
}

object StorageOptions {
  @scala.inline
  def apply(email: String, password: String): StorageOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
  @scala.inline
  implicit class StorageOptionsOps[Self <: StorageOptions] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoload(value: Boolean): Self = this.set("autoload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoload: Self = this.set("autoload", js.undefined)
    @scala.inline
    def setAutologin(value: Boolean): Self = this.set("autologin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutologin: Self = this.set("autologin", js.undefined)
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
  }
  
}

