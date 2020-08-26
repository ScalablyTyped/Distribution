package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginStyle extends js.Object {
  var loginStyle: js.UndefOr[String] = js.native
  var loginUrlParameters: js.UndefOr[js.Object] = js.native
  var redirectUrl: js.UndefOr[String] = js.native
  var requestOfflineToken: js.UndefOr[Boolean] = js.native
  var requestPermissions: js.UndefOr[js.Array[String]] = js.native
  var userEmail: js.UndefOr[String] = js.native
}

object LoginStyle {
  @scala.inline
  def apply(): LoginStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginStyle]
  }
  @scala.inline
  implicit class LoginStyleOps[Self <: LoginStyle] (val x: Self) extends AnyVal {
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
    def setLoginStyle(value: String): Self = this.set("loginStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginStyle: Self = this.set("loginStyle", js.undefined)
    @scala.inline
    def setLoginUrlParameters(value: js.Object): Self = this.set("loginUrlParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginUrlParameters: Self = this.set("loginUrlParameters", js.undefined)
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    @scala.inline
    def setRequestOfflineToken(value: Boolean): Self = this.set("requestOfflineToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOfflineToken: Self = this.set("requestOfflineToken", js.undefined)
    @scala.inline
    def setRequestPermissionsVarargs(value: String*): Self = this.set("requestPermissions", js.Array(value :_*))
    @scala.inline
    def setRequestPermissions(value: js.Array[String]): Self = this.set("requestPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPermissions: Self = this.set("requestPermissions", js.undefined)
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
  }
  
}

