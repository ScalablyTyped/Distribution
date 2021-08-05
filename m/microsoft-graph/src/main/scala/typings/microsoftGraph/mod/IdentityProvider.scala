package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProvider
  extends StObject
     with Entity {
  
  var clientId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var clientSecret: js.UndefOr[NullableOption[String]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object IdentityProvider {
  
  inline def apply(): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProvider]
  }
  
  extension [Self <: IdentityProvider](x: Self) {
    
    inline def setClientId(value: NullableOption[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: NullableOption[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
