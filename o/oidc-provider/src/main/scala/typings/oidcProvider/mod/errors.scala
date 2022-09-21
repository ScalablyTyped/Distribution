package typings.oidcProvider.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("oidc-provider", "errors.AccessDenied")
  @js.native
  open class AccessDenied () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.AuthorizationPending")
  @js.native
  open class AuthorizationPending () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.ConsentRequired")
  @js.native
  open class ConsentRequired () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.CustomOIDCProviderError")
  @js.native
  open class CustomOIDCProviderError protected () extends OIDCProviderError {
    def this(message: String) = this()
    def this(message: String, description: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.ExpiredLoginHintToken")
  @js.native
  open class ExpiredLoginHintToken () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.ExpiredToken")
  @js.native
  open class ExpiredToken () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InsufficientScope")
  @js.native
  open class InsufficientScope protected () extends OIDCProviderError {
    def this(description: String, scope: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InteractionRequired")
  @js.native
  open class InteractionRequired () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidBindingMessage")
  @js.native
  open class InvalidBindingMessage () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidClient")
  @js.native
  open class InvalidClient () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidClientAuth")
  @js.native
  open class InvalidClientAuth protected () extends OIDCProviderError {
    def this(detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidClientMetadata")
  @js.native
  open class InvalidClientMetadata protected () extends OIDCProviderError {
    def this(description: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidDpopProof")
  @js.native
  open class InvalidDpopProof () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidGrant")
  @js.native
  open class InvalidGrant protected () extends OIDCProviderError {
    def this(detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidRedirectUri")
  @js.native
  open class InvalidRedirectUri () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidRequest")
  @js.native
  open class InvalidRequest protected () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, code: Double) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidRequestObject")
  @js.native
  open class InvalidRequestObject () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidRequestUri")
  @js.native
  open class InvalidRequestUri () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidScope")
  @js.native
  open class InvalidScope protected () extends OIDCProviderError {
    def this(description: String, scope: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidSoftwareStatement")
  @js.native
  open class InvalidSoftwareStatement () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidTarget")
  @js.native
  open class InvalidTarget () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidToken")
  @js.native
  open class InvalidToken protected () extends OIDCProviderError {
    def this(detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.InvalidUserCode")
  @js.native
  open class InvalidUserCode () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.LoginRequired")
  @js.native
  open class LoginRequired () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.MissingUserCode")
  @js.native
  open class MissingUserCode () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.OIDCProviderError")
  @js.native
  open class OIDCProviderError protected ()
    extends StObject
       with Error {
    def this(status: Double, message: String) = this()
    
    var allow_redirect: Boolean = js.native
    
    var error: String = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    var error_detail: js.UndefOr[String] = js.native
    
    var expose: Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
    
    var statusCode: Double = js.native
  }
  
  @JSImport("oidc-provider", "errors.RegistrationNotSupported")
  @js.native
  open class RegistrationNotSupported () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.RequestNotSupported")
  @js.native
  open class RequestNotSupported () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.RequestUriNotSupported")
  @js.native
  open class RequestUriNotSupported () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.SessionNotFound")
  @js.native
  open class SessionNotFound protected () extends InvalidRequest {
    def this(description: String) = this()
    def this(description: String, code: Double) = this()
  }
  
  @JSImport("oidc-provider", "errors.SlowDown")
  @js.native
  open class SlowDown () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.TemporarilyUnavailable")
  @js.native
  open class TemporarilyUnavailable () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.TransactionFailed")
  @js.native
  open class TransactionFailed () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.UnapprovedSoftwareStatement")
  @js.native
  open class UnapprovedSoftwareStatement () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.UnauthorizedClient")
  @js.native
  open class UnauthorizedClient () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.UnknownUserId")
  @js.native
  open class UnknownUserId () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.UnsupportedGrantType")
  @js.native
  open class UnsupportedGrantType () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.UnsupportedResponseMode")
  @js.native
  open class UnsupportedResponseMode () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.UnsupportedResponseType")
  @js.native
  open class UnsupportedResponseType () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
  
  @JSImport("oidc-provider", "errors.WebMessageUriMismatch")
  @js.native
  open class WebMessageUriMismatch () extends OIDCProviderError {
    def this(description: String) = this()
    def this(description: String, detail: String) = this()
    def this(description: Unit, detail: String) = this()
  }
}
