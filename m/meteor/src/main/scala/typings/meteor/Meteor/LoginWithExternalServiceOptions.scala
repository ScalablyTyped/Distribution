package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
@js.native
trait LoginWithExternalServiceOptions extends js.Object {
  var forceApprovalPrompt: js.UndefOr[Boolean] = js.native
  var loginHint: js.UndefOr[String] = js.native
  var loginStyle: js.UndefOr[String] = js.native
  var loginUrlParameters: js.UndefOr[js.Object] = js.native
  var redirectUrl: js.UndefOr[String] = js.native
  var requestOfflineToken: js.UndefOr[Boolean] = js.native
  var requestPermissions: js.UndefOr[js.Array[String]] = js.native
}

object LoginWithExternalServiceOptions {
  @scala.inline
  def apply(): LoginWithExternalServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithExternalServiceOptions]
  }
  @scala.inline
  implicit class LoginWithExternalServiceOptionsOps[Self <: LoginWithExternalServiceOptions] (val x: Self) extends AnyVal {
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
    def setForceApprovalPrompt(value: Boolean): Self = this.set("forceApprovalPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceApprovalPrompt: Self = this.set("forceApprovalPrompt", js.undefined)
    @scala.inline
    def setLoginHint(value: String): Self = this.set("loginHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginHint: Self = this.set("loginHint", js.undefined)
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
  }
  
}

