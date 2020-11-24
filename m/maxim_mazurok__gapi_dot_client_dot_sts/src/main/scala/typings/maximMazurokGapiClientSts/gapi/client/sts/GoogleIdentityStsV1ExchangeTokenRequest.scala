package typings.maximMazurokGapiClientSts.gapi.client.sts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityStsV1ExchangeTokenRequest extends js.Object {
  
  /** Required. The grant type. Must be `urn:ietf:params:oauth:grant-type:token-exchange`, which indicates a token exchange. */
  var grantType: js.UndefOr[String] = js.native
  
  /** A set of features that Security Token Service supports, in addition to the standard OAuth 2.0 token exchange, formatted as a serialized JSON object of Options. */
  var options: js.UndefOr[String] = js.native
  
  /** Required. An identifier for the type of requested security token. Must be `urn:ietf:params:oauth:token-type:access_token`. */
  var requestedTokenType: js.UndefOr[String] = js.native
  
  /**
    * Required. The input token. You can use a Google-issued OAuth 2.0 access token with this field to obtain an access token with new security attributes applied, such as a Credential
    * Access Boundary. If an access token already contains security attributes, you cannot apply additional security attributes.
    */
  var subjectToken: js.UndefOr[String] = js.native
  
  /** Required. An identifier that indicates the type of the security token in the `subject_token` parameter. Must be `urn:ietf:params:oauth:token-type:access_token`. */
  var subjectTokenType: js.UndefOr[String] = js.native
}
object GoogleIdentityStsV1ExchangeTokenRequest {
  
  @scala.inline
  def apply(): GoogleIdentityStsV1ExchangeTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityStsV1ExchangeTokenRequest]
  }
  
  @scala.inline
  implicit class GoogleIdentityStsV1ExchangeTokenRequestOps[Self <: GoogleIdentityStsV1ExchangeTokenRequest] (val x: Self) extends AnyVal {
    
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
    def setGrantType(value: String): Self = this.set("grantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantType: Self = this.set("grantType", js.undefined)
    
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRequestedTokenType(value: String): Self = this.set("requestedTokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedTokenType: Self = this.set("requestedTokenType", js.undefined)
    
    @scala.inline
    def setSubjectToken(value: String): Self = this.set("subjectToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectToken: Self = this.set("subjectToken", js.undefined)
    
    @scala.inline
    def setSubjectTokenType(value: String): Self = this.set("subjectTokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectTokenType: Self = this.set("subjectTokenType", js.undefined)
  }
}
