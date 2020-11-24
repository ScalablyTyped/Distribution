package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAuthUriResponse extends js.Object {
  
  /** all providers the user has once used to do federated login */
  var allProviders: js.UndefOr[js.Array[String]] = js.native
  
  /** The URI used by the IDP to authenticate the user. */
  var authUri: js.UndefOr[String] = js.native
  
  /** True if captcha is required. */
  var captchaRequired: js.UndefOr[Boolean] = js.native
  
  /** True if the authUri is for user's existing provider. */
  var forExistingProvider: js.UndefOr[Boolean] = js.native
  
  /** The fixed string identitytoolkit#CreateAuthUriResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The provider ID of the auth URI. */
  var providerId: js.UndefOr[String] = js.native
  
  /** Whether the user is registered if the identifier is an email. */
  var registered: js.UndefOr[Boolean] = js.native
  
  /** Session ID which should be passed in the following verifyAssertion request. */
  var sessionId: js.UndefOr[String] = js.native
  
  /** All sign-in methods this user has used. */
  var signinMethods: js.UndefOr[js.Array[String]] = js.native
}
object CreateAuthUriResponse {
  
  @scala.inline
  def apply(): CreateAuthUriResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAuthUriResponse]
  }
  
  @scala.inline
  implicit class CreateAuthUriResponseOps[Self <: CreateAuthUriResponse] (val x: Self) extends AnyVal {
    
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
    def setAllProvidersVarargs(value: String*): Self = this.set("allProviders", js.Array(value :_*))
    
    @scala.inline
    def setAllProviders(value: js.Array[String]): Self = this.set("allProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllProviders: Self = this.set("allProviders", js.undefined)
    
    @scala.inline
    def setAuthUri(value: String): Self = this.set("authUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthUri: Self = this.set("authUri", js.undefined)
    
    @scala.inline
    def setCaptchaRequired(value: Boolean): Self = this.set("captchaRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptchaRequired: Self = this.set("captchaRequired", js.undefined)
    
    @scala.inline
    def setForExistingProvider(value: Boolean): Self = this.set("forExistingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForExistingProvider: Self = this.set("forExistingProvider", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
    
    @scala.inline
    def setRegistered(value: Boolean): Self = this.set("registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistered: Self = this.set("registered", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    
    @scala.inline
    def setSigninMethodsVarargs(value: String*): Self = this.set("signinMethods", js.Array(value :_*))
    
    @scala.inline
    def setSigninMethods(value: js.Array[String]): Self = this.set("signinMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigninMethods: Self = this.set("signinMethods", js.undefined)
  }
}
