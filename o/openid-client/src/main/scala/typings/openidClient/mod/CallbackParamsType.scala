package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackParamsType
  extends /* key */ StringDictionary[js.Any] {
  var access_token: js.UndefOr[String] = js.native
  var code: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var error_description: js.UndefOr[String] = js.native
  var error_uri: js.UndefOr[String] = js.native
  var expires_in: js.UndefOr[String] = js.native
  var id_token: js.UndefOr[String] = js.native
  var response: js.UndefOr[String] = js.native
  var session_state: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var token_type: js.UndefOr[String] = js.native
}

object CallbackParamsType {
  @scala.inline
  def apply(): CallbackParamsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackParamsType]
  }
  @scala.inline
  implicit class CallbackParamsTypeOps[Self <: CallbackParamsType] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setError_description(value: String): Self = this.set("error_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_description: Self = this.set("error_description", js.undefined)
    @scala.inline
    def setError_uri(value: String): Self = this.set("error_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_uri: Self = this.set("error_uri", js.undefined)
    @scala.inline
    def setExpires_in(value: String): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_in: Self = this.set("expires_in", js.undefined)
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setSession_state(value: String): Self = this.set("session_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_state: Self = this.set("session_state", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
  }
  
}

