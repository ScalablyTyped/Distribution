package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativeSecurityId extends StObject {
  
  // For internal use only
  var identityProvider: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only
  var key: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only
  var `type`: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AlternativeSecurityId {
  
  inline def apply(): AlternativeSecurityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternativeSecurityId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlternativeSecurityId] (val x: Self) extends AnyVal {
    
    inline def setIdentityProvider(value: NullableOption[String]): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNull: Self = StObject.set(x, "identityProvider", null)
    
    inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
    
    inline def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: NullableOption[Double]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
