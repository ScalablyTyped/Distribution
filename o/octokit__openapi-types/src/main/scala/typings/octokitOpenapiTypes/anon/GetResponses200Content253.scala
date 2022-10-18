package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content253 extends StObject {
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an enterprise,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Enforcing a policy for workflow permissions in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-policies-for-github-actions-in-your-enterprise#enforcing-a-policy-for-workflow-permissions-in-your-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    * GitHub Apps must have the `enterprise_administration:write` permission to use this endpoint.
    */
  var get: Responses200Content253
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an enterprise, and sets
    * whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Enforcing a policy for workflow permissions in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-policies-for-github-actions-in-your-enterprise#enforcing-a-policy-for-workflow-permissions-in-your-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    * GitHub Apps must have the `enterprise_administration:write` permission to use this endpoint.
    */
  var put: RequestBodyContent254
}
object GetResponses200Content253 {
  
  inline def apply(get: Responses200Content253, put: RequestBodyContent254): GetResponses200Content253 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content253]
  }
  
  extension [Self <: GetResponses200Content253](x: Self) {
    
    inline def setGet(value: Responses200Content253): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent254): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
