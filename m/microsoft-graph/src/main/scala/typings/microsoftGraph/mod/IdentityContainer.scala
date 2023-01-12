package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityContainer
  extends StObject
     with Entity {
  
  // Represents entry point for API connectors.
  var apiConnectors: js.UndefOr[NullableOption[js.Array[IdentityApiConnector]]] = js.undefined
  
  // Represents entry point for B2X/self-service sign-up identity userflows.
  var b2xUserFlows: js.UndefOr[NullableOption[js.Array[B2xIdentityUserFlow]]] = js.undefined
  
  // the entry point for the Conditional Access (CA) object model.
  var conditionalAccess: js.UndefOr[NullableOption[ConditionalAccessRoot]] = js.undefined
  
  var identityProviders: js.UndefOr[NullableOption[js.Array[IdentityProviderBase]]] = js.undefined
  
  // Represents entry point for identity userflow attributes.
  var userFlowAttributes: js.UndefOr[NullableOption[js.Array[IdentityUserFlowAttribute]]] = js.undefined
}
object IdentityContainer {
  
  inline def apply(): IdentityContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityContainer] (val x: Self) extends AnyVal {
    
    inline def setApiConnectors(value: NullableOption[js.Array[IdentityApiConnector]]): Self = StObject.set(x, "apiConnectors", value.asInstanceOf[js.Any])
    
    inline def setApiConnectorsNull: Self = StObject.set(x, "apiConnectors", null)
    
    inline def setApiConnectorsUndefined: Self = StObject.set(x, "apiConnectors", js.undefined)
    
    inline def setApiConnectorsVarargs(value: IdentityApiConnector*): Self = StObject.set(x, "apiConnectors", js.Array(value*))
    
    inline def setB2xUserFlows(value: NullableOption[js.Array[B2xIdentityUserFlow]]): Self = StObject.set(x, "b2xUserFlows", value.asInstanceOf[js.Any])
    
    inline def setB2xUserFlowsNull: Self = StObject.set(x, "b2xUserFlows", null)
    
    inline def setB2xUserFlowsUndefined: Self = StObject.set(x, "b2xUserFlows", js.undefined)
    
    inline def setB2xUserFlowsVarargs(value: B2xIdentityUserFlow*): Self = StObject.set(x, "b2xUserFlows", js.Array(value*))
    
    inline def setConditionalAccess(value: NullableOption[ConditionalAccessRoot]): Self = StObject.set(x, "conditionalAccess", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessNull: Self = StObject.set(x, "conditionalAccess", null)
    
    inline def setConditionalAccessUndefined: Self = StObject.set(x, "conditionalAccess", js.undefined)
    
    inline def setIdentityProviders(value: NullableOption[js.Array[IdentityProviderBase]]): Self = StObject.set(x, "identityProviders", value.asInstanceOf[js.Any])
    
    inline def setIdentityProvidersNull: Self = StObject.set(x, "identityProviders", null)
    
    inline def setIdentityProvidersUndefined: Self = StObject.set(x, "identityProviders", js.undefined)
    
    inline def setIdentityProvidersVarargs(value: IdentityProviderBase*): Self = StObject.set(x, "identityProviders", js.Array(value*))
    
    inline def setUserFlowAttributes(value: NullableOption[js.Array[IdentityUserFlowAttribute]]): Self = StObject.set(x, "userFlowAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserFlowAttributesNull: Self = StObject.set(x, "userFlowAttributes", null)
    
    inline def setUserFlowAttributesUndefined: Self = StObject.set(x, "userFlowAttributes", js.undefined)
    
    inline def setUserFlowAttributesVarargs(value: IdentityUserFlowAttribute*): Self = StObject.set(x, "userFlowAttributes", js.Array(value*))
  }
}
