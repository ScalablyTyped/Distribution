package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginResponse extends js.Object {
  var androidId: String = js.native
  var masterToken: String = js.native
}

object LoginResponse {
  @scala.inline
  def apply(androidId: String, masterToken: String): LoginResponse = {
    val __obj = js.Dynamic.literal(androidId = androidId.asInstanceOf[js.Any], masterToken = masterToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  @scala.inline
  implicit class LoginResponseOps[Self <: LoginResponse] (val x: Self) extends AnyVal {
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
    def setAndroidId(value: String): Self = this.set("androidId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterToken(value: String): Self = this.set("masterToken", value.asInstanceOf[js.Any])
  }
  
}

