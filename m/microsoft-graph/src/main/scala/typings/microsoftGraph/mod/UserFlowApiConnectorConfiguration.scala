package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserFlowApiConnectorConfiguration extends StObject {
  
  var postAttributeCollection: js.UndefOr[NullableOption[IdentityApiConnector]] = js.undefined
  
  var postFederationSignup: js.UndefOr[NullableOption[IdentityApiConnector]] = js.undefined
}
object UserFlowApiConnectorConfiguration {
  
  inline def apply(): UserFlowApiConnectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFlowApiConnectorConfiguration]
  }
  
  extension [Self <: UserFlowApiConnectorConfiguration](x: Self) {
    
    inline def setPostAttributeCollection(value: NullableOption[IdentityApiConnector]): Self = StObject.set(x, "postAttributeCollection", value.asInstanceOf[js.Any])
    
    inline def setPostAttributeCollectionNull: Self = StObject.set(x, "postAttributeCollection", null)
    
    inline def setPostAttributeCollectionUndefined: Self = StObject.set(x, "postAttributeCollection", js.undefined)
    
    inline def setPostFederationSignup(value: NullableOption[IdentityApiConnector]): Self = StObject.set(x, "postFederationSignup", value.asInstanceOf[js.Any])
    
    inline def setPostFederationSignupNull: Self = StObject.set(x, "postFederationSignup", null)
    
    inline def setPostFederationSignupUndefined: Self = StObject.set(x, "postFederationSignup", js.undefined)
  }
}
