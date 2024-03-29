package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent184 extends StObject {
  
  /**
    * Review custom deployment protection rules for a workflow run
    * @description Approve or reject custom deployment protection rules provided by a GitHub App for a workflow run. For more information, see "[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment)."
    *
    * **Note:** GitHub Apps can only review their own custom deployment protection rules.
    * To approve or reject pending deployments that are waiting for review from a specific person or team, see [`POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments`](/rest/actions/workflow-runs#review-pending-deployments-for-a-workflow-run).
    *
    * GitHub Apps must have read and write permission for **Deployments** to use this endpoint.
    */
  var post: RequestBodyContent184
}
object PostRequestBodyContent184 {
  
  inline def apply(post: RequestBodyContent184): PostRequestBodyContent184 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent184]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent184] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent184): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
