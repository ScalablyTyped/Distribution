package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInIdentityProvider
  extends StObject
     with IdentityProviderBase {
  
  // The identity provider type. For a B2B scenario, possible values: AADSignup, MicrosoftAccount, EmailOTP. Required.
  var identityProviderType: js.UndefOr[NullableOption[String]] = js.undefined
}
object BuiltInIdentityProvider {
  
  inline def apply(): BuiltInIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltInIdentityProvider]
  }
  
  extension [Self <: BuiltInIdentityProvider](x: Self) {
    
    inline def setIdentityProviderType(value: NullableOption[String]): Self = StObject.set(x, "identityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeNull: Self = StObject.set(x, "identityProviderType", null)
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "identityProviderType", js.undefined)
  }
}
