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
  
  @scala.inline
  def apply(): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProvider]
  }
  
  @scala.inline
  implicit class IdentityProviderMutableBuilder[Self <: IdentityProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: NullableOption[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: NullableOption[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
