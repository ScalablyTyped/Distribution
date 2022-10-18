package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeploymentidOwnerQuery250 extends StObject {
  
  /** Users with pull access can view deployment statuses for a deployment: */
  var get: ParametersPathDeploymentidOwnerQuery250
  
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  var post: Responses201Content490
}
object GetParametersPathDeploymentidOwnerQuery250 {
  
  inline def apply(get: ParametersPathDeploymentidOwnerQuery250, post: Responses201Content490): GetParametersPathDeploymentidOwnerQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeploymentidOwnerQuery250]
  }
  
  extension [Self <: GetParametersPathDeploymentidOwnerQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathDeploymentidOwnerQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content490): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
