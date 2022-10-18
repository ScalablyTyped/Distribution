package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deploymentbranchpolicy extends StObject {
  
  /**
    * Format: date-time
    * @description The time that the environment was created, in ISO 8601 format.
    * @example 2020-11-23T22:00:40Z
    */
  var created_at: String
  
  var deployment_branch_policy: js.UndefOr[Custombranchpolicies | Null] = js.undefined
  
  /** @example https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging */
  var html_url: String
  
  /**
    * @description The id of the environment.
    * @example 56780428
    */
  var id: Double
  
  /**
    * @description The name of the environment.
    * @example staging
    */
  var name: String
  
  /** @example MDExOkVudmlyb25tZW50NTY3ODA0Mjg= */
  var node_id: String
  
  var protection_rules: js.UndefOr[js.Array[Partialidnumbernodeidstri]] = js.undefined
  
  /**
    * Format: date-time
    * @description The time that the environment was last updated, in ISO 8601 format.
    * @example 2020-11-23T22:00:40Z
    */
  var updated_at: String
  
  /** @example https://api.github.com/repos/github/hello-world/environments/staging */
  var url: String
}
object Deploymentbranchpolicy {
  
  inline def apply(
    created_at: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    updated_at: String,
    url: String
  ): Deploymentbranchpolicy = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploymentbranchpolicy]
  }
  
  extension [Self <: Deploymentbranchpolicy](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeployment_branch_policy(value: Custombranchpolicies): Self = StObject.set(x, "deployment_branch_policy", value.asInstanceOf[js.Any])
    
    inline def setDeployment_branch_policyNull: Self = StObject.set(x, "deployment_branch_policy", null)
    
    inline def setDeployment_branch_policyUndefined: Self = StObject.set(x, "deployment_branch_policy", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setProtection_rules(value: js.Array[Partialidnumbernodeidstri]): Self = StObject.set(x, "protection_rules", value.asInstanceOf[js.Any])
    
    inline def setProtection_rulesUndefined: Self = StObject.set(x, "protection_rules", js.undefined)
    
    inline def setProtection_rulesVarargs(value: Partialidnumbernodeidstri*): Self = StObject.set(x, "protection_rules", js.Array(value*))
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
