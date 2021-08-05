package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedSubscription extends StObject {
  
  /**
    * The authorization source of the subscription: 'RoleBased' , 'Legacy', 'Bypassed',' Direct', 'Management'. 
    * It could also be a comma separated string containing more values 'Bypassed, Direct, Management'.
    */
  var authorizationSource: String
  
  /**
    * The environment name For example: AzureCloud, AzureChina, USGovernment, GermanCloud, or your own Dogfood environment
    */
  var environmentName: String
  
  /**
    * The subscriptionId (usually a GUID).
    */
  var id: String
  
  /**
    * Display name of the subscription.
    */
  var name: String
  
  /**
    * The state of the subscription. Example values: 'Enabled', 'Disabled', 'Warned', 'PastDue', 'Deleted'.
    */
  var state: String
  
  /**
    * The tenant that the subscription belongs to.
    */
  var tenantId: String
  
  /**
    * The user associated with the subscription. This could be a user or a serviceprincipal.
    */
  var user: LinkedUser
}
object LinkedSubscription {
  
  inline def apply(
    authorizationSource: String,
    environmentName: String,
    id: String,
    name: String,
    state: String,
    tenantId: String,
    user: LinkedUser
  ): LinkedSubscription = {
    val __obj = js.Dynamic.literal(authorizationSource = authorizationSource.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedSubscription]
  }
  
  extension [Self <: LinkedSubscription](x: Self) {
    
    inline def setAuthorizationSource(value: String): Self = StObject.set(x, "authorizationSource", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setUser(value: LinkedUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
