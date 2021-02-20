package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalClaims extends StObject {
  
  // The optional claims returned in the JWT access token.
  var accessToken: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.native
  
  // The optional claims returned in the JWT ID token.
  var idToken: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.native
  
  // The optional claims returned in the SAML token.
  var saml2Token: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.native
}
object OptionalClaims {
  
  @scala.inline
  def apply(): OptionalClaims = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalClaims]
  }
  
  @scala.inline
  implicit class OptionalClaimsMutableBuilder[Self <: OptionalClaims] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: NullableOption[js.Array[OptionalClaim]]): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setAccessTokenVarargs(value: OptionalClaim*): Self = StObject.set(x, "accessToken", js.Array(value :_*))
    
    @scala.inline
    def setIdToken(value: NullableOption[js.Array[OptionalClaim]]): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setIdTokenVarargs(value: OptionalClaim*): Self = StObject.set(x, "idToken", js.Array(value :_*))
    
    @scala.inline
    def setSaml2Token(value: NullableOption[js.Array[OptionalClaim]]): Self = StObject.set(x, "saml2Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaml2TokenNull: Self = StObject.set(x, "saml2Token", null)
    
    @scala.inline
    def setSaml2TokenUndefined: Self = StObject.set(x, "saml2Token", js.undefined)
    
    @scala.inline
    def setSaml2TokenVarargs(value: OptionalClaim*): Self = StObject.set(x, "saml2Token", js.Array(value :_*))
  }
}
