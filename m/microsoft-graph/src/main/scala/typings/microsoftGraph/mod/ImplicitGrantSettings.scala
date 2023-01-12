package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplicitGrantSettings extends StObject {
  
  // Specifies whether this web application can request an access token using the OAuth 2.0 implicit flow.
  var enableAccessTokenIssuance: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether this web application can request an ID token using the OAuth 2.0 implicit flow.
  var enableIdTokenIssuance: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ImplicitGrantSettings {
  
  inline def apply(): ImplicitGrantSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplicitGrantSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplicitGrantSettings] (val x: Self) extends AnyVal {
    
    inline def setEnableAccessTokenIssuance(value: NullableOption[Boolean]): Self = StObject.set(x, "enableAccessTokenIssuance", value.asInstanceOf[js.Any])
    
    inline def setEnableAccessTokenIssuanceNull: Self = StObject.set(x, "enableAccessTokenIssuance", null)
    
    inline def setEnableAccessTokenIssuanceUndefined: Self = StObject.set(x, "enableAccessTokenIssuance", js.undefined)
    
    inline def setEnableIdTokenIssuance(value: NullableOption[Boolean]): Self = StObject.set(x, "enableIdTokenIssuance", value.asInstanceOf[js.Any])
    
    inline def setEnableIdTokenIssuanceNull: Self = StObject.set(x, "enableIdTokenIssuance", null)
    
    inline def setEnableIdTokenIssuanceUndefined: Self = StObject.set(x, "enableIdTokenIssuance", js.undefined)
  }
}
