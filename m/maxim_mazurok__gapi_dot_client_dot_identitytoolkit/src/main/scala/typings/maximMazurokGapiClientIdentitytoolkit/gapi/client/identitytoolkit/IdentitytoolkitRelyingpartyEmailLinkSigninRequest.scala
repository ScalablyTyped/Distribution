package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyEmailLinkSigninRequest extends StObject {
  
  /** The email address of the user. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Token for linking flow. */
  var idToken: js.UndefOr[String] = js.undefined
  
  /** The confirmation code. */
  var oobCode: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyEmailLinkSigninRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyEmailLinkSigninRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartyEmailLinkSigninRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
