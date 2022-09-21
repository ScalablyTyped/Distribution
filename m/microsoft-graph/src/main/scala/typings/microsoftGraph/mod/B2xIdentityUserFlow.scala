package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B2xIdentityUserFlow
  extends StObject
     with IdentityUserFlow {
  
  /**
    * Configuration for enabling an API connector for use as part of the self-service sign-up user flow. You can only obtain
    * the value of this object using Get userFlowApiConnectorConfiguration.
    */
  var apiConnectorConfiguration: js.UndefOr[NullableOption[UserFlowApiConnectorConfiguration]] = js.undefined
  
  // The identity providers included in the user flow.
  var identityProviders: js.UndefOr[NullableOption[js.Array[IdentityProvider]]] = js.undefined
  
  /**
    * The languages supported for customization within the user flow. Language customization is enabled by default in
    * self-service sign-up user flow. You cannot create custom languages in self-service sign-up user flows.
    */
  var languages: js.UndefOr[NullableOption[js.Array[UserFlowLanguageConfiguration]]] = js.undefined
  
  // The user attribute assignments included in the user flow.
  var userAttributeAssignments: js.UndefOr[NullableOption[js.Array[IdentityUserFlowAttributeAssignment]]] = js.undefined
  
  var userFlowIdentityProviders: js.UndefOr[NullableOption[js.Array[IdentityProviderBase]]] = js.undefined
}
object B2xIdentityUserFlow {
  
  inline def apply(): B2xIdentityUserFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[B2xIdentityUserFlow]
  }
  
  extension [Self <: B2xIdentityUserFlow](x: Self) {
    
    inline def setApiConnectorConfiguration(value: NullableOption[UserFlowApiConnectorConfiguration]): Self = StObject.set(x, "apiConnectorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApiConnectorConfigurationNull: Self = StObject.set(x, "apiConnectorConfiguration", null)
    
    inline def setApiConnectorConfigurationUndefined: Self = StObject.set(x, "apiConnectorConfiguration", js.undefined)
    
    inline def setIdentityProviders(value: NullableOption[js.Array[IdentityProvider]]): Self = StObject.set(x, "identityProviders", value.asInstanceOf[js.Any])
    
    inline def setIdentityProvidersNull: Self = StObject.set(x, "identityProviders", null)
    
    inline def setIdentityProvidersUndefined: Self = StObject.set(x, "identityProviders", js.undefined)
    
    inline def setIdentityProvidersVarargs(value: IdentityProvider*): Self = StObject.set(x, "identityProviders", js.Array(value*))
    
    inline def setLanguages(value: NullableOption[js.Array[UserFlowLanguageConfiguration]]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesNull: Self = StObject.set(x, "languages", null)
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: UserFlowLanguageConfiguration*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setUserAttributeAssignments(value: NullableOption[js.Array[IdentityUserFlowAttributeAssignment]]): Self = StObject.set(x, "userAttributeAssignments", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeAssignmentsNull: Self = StObject.set(x, "userAttributeAssignments", null)
    
    inline def setUserAttributeAssignmentsUndefined: Self = StObject.set(x, "userAttributeAssignments", js.undefined)
    
    inline def setUserAttributeAssignmentsVarargs(value: IdentityUserFlowAttributeAssignment*): Self = StObject.set(x, "userAttributeAssignments", js.Array(value*))
    
    inline def setUserFlowIdentityProviders(value: NullableOption[js.Array[IdentityProviderBase]]): Self = StObject.set(x, "userFlowIdentityProviders", value.asInstanceOf[js.Any])
    
    inline def setUserFlowIdentityProvidersNull: Self = StObject.set(x, "userFlowIdentityProviders", null)
    
    inline def setUserFlowIdentityProvidersUndefined: Self = StObject.set(x, "userFlowIdentityProviders", js.undefined)
    
    inline def setUserFlowIdentityProvidersVarargs(value: IdentityProviderBase*): Self = StObject.set(x, "userFlowIdentityProviders", js.Array(value*))
  }
}
