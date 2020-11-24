package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthCallbackChecks extends js.Object {
  
  /**
    * PKCE code_verifier to be sent to the token endpoint during code exchange. Use of this check is required
    * if you sent a code_challenge parameter into an authorization request.
    */
  var code_verifier: js.UndefOr[String] = js.native
  
  /**
    * This must be set to true when requesting JARM responses.
    */
  var jarm: js.UndefOr[Boolean] = js.native
  
  /**
    * When provided the authorization response will be checked for presence of required parameters for a
    * given response_type. Use of this check is recommended.
    */
  var response_type: js.UndefOr[String] = js.native
  
  /**
    * When provided the authorization response's state parameter will be checked to be the this expected one.
    * Use of this check is required if you sent a state parameter into an authorization request.
    */
  var state: js.UndefOr[String] = js.native
}
object OAuthCallbackChecks {
  
  @scala.inline
  def apply(): OAuthCallbackChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCallbackChecks]
  }
  
  @scala.inline
  implicit class OAuthCallbackChecksOps[Self <: OAuthCallbackChecks] (val x: Self) extends AnyVal {
    
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
    def setCode_verifier(value: String): Self = this.set("code_verifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode_verifier: Self = this.set("code_verifier", js.undefined)
    
    @scala.inline
    def setJarm(value: Boolean): Self = this.set("jarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJarm: Self = this.set("jarm", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
