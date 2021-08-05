package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalClaims extends StObject {
  
  // The optional claims returned in the JWT access token.
  var accessToken: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.undefined
  
  // The optional claims returned in the JWT ID token.
  var idToken: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.undefined
  
  // The optional claims returned in the SAML token.
  var saml2Token: js.UndefOr[NullableOption[js.Array[OptionalClaim]]] = js.undefined
}
object OptionalClaims {
  
  inline def apply(): OptionalClaims = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalClaims]
  }
  
  extension [Self <: OptionalClaims](x: Self) {
    
    inline def setAccessToken(value: NullableOption[js.Array[OptionalClaim]]): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setAccessTokenVarargs(value: OptionalClaim*): Self = StObject.set(x, "accessToken", js.Array(value :_*))
    
    inline def setIdToken(value: NullableOption[js.Array[OptionalClaim]]): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setIdTokenVarargs(value: OptionalClaim*): Self = StObject.set(x, "idToken", js.Array(value :_*))
    
    inline def setSaml2Token(value: NullableOption[js.Array[OptionalClaim]]): Self = StObject.set(x, "saml2Token", value.asInstanceOf[js.Any])
    
    inline def setSaml2TokenNull: Self = StObject.set(x, "saml2Token", null)
    
    inline def setSaml2TokenUndefined: Self = StObject.set(x, "saml2Token", js.undefined)
    
    inline def setSaml2TokenVarargs(value: OptionalClaim*): Self = StObject.set(x, "saml2Token", js.Array(value :_*))
  }
}
