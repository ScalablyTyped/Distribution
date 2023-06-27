package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeploymentidQuery extends StObject {
  
  /**
    * List deployment statuses
    * @description Users with pull access can view deployment statuses for a deployment:
    */
  var get: ParametersPathDeploymentidQuery
  
  /**
    * Create a deployment status
    * @description Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  var post: RequestBodyContentApplicationjsonAutoinactive
}
object GetParametersPathDeploymentidQuery {
  
  inline def apply(get: ParametersPathDeploymentidQuery, post: RequestBodyContentApplicationjsonAutoinactive): GetParametersPathDeploymentidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeploymentidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathDeploymentidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathDeploymentidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAutoinactive): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
