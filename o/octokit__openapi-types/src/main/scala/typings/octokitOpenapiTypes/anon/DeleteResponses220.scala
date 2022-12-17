package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses220 extends StObject {
  
  /**
    * If the repository only has one deployment, you can delete the deployment regardless of its status. If the repository has more than one deployment, you can only delete inactive deployments. This ensures that repositories with multiple deployments will always have an active deployment. Anyone with `repo` or `repo_deployment` scopes can delete a deployment.
    *
    * To set a deployment as inactive, you must:
    *
    * *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment.
    * *   Mark the active deployment as inactive by adding any non-successful deployment status.
    *
    * For more information, see "[Create a deployment](https://docs.github.com/rest/reference/repos/#create-a-deployment)" and "[Create a deployment status](https://docs.github.com/rest/reference/repos#create-a-deployment-status)."
    */
  var delete: Responses220
  
  var get: ParametersPathDeploymentid
}
object DeleteResponses220 {
  
  inline def apply(delete: Responses220, get: ParametersPathDeploymentid): DeleteResponses220 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses220]
  }
  
  extension [Self <: DeleteResponses220](x: Self) {
    
    inline def setDelete(value: Responses220): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathDeploymentid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
