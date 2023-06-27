package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content187 extends StObject {
  
  /**
    * Get pending deployments for a workflow run
    * @description Get all deployment environments for a workflow run that are waiting for protection rules to pass.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200Content187
  
  /**
    * Review pending deployments for a workflow run
    * @description Approve or reject pending deployments that are waiting on approval by a required reviewer.
    *
    * Required reviewers with read access to the repository contents and deployments can use this endpoint. Required reviewers must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonComment
}
object GetResponses200Content187 {
  
  inline def apply(get: Responses200Content187, post: RequestBodyContentApplicationjsonComment): GetResponses200Content187 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content187]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content187] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content187): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonComment): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
