package typings.maximMazurokGapiClientSts.gapi.client.sts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityStsV1ExchangeTokenResponse extends js.Object {
  
  /** An OAuth 2.0 security token, issued by Google, in response to the token exchange request. */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * The amount of time, in seconds, between the time when the `access_token` was issued and the time when the `access_token` will expire. This field is absent when the `subject_token`
    * in the request is a Google-issued, short-lived access token. In this case, the `access_token` has the same expiration time as the `subject_token`.
    */
  var expires_in: js.UndefOr[Double] = js.native
  
  /** The token type. Always matches the value of `requested_token_type` from the request. */
  var issued_token_type: js.UndefOr[String] = js.native
  
  /** The type of `access_token`. Always has the value `Bearer`. */
  var token_type: js.UndefOr[String] = js.native
}
object GoogleIdentityStsV1ExchangeTokenResponse {
  
  @scala.inline
  def apply(): GoogleIdentityStsV1ExchangeTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityStsV1ExchangeTokenResponse]
  }
  
  @scala.inline
  implicit class GoogleIdentityStsV1ExchangeTokenResponseOps[Self <: GoogleIdentityStsV1ExchangeTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires_in: Self = this.set("expires_in", js.undefined)
    
    @scala.inline
    def setIssued_token_type(value: String): Self = this.set("issued_token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssued_token_type: Self = this.set("issued_token_type", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
  }
}
