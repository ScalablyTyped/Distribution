package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content17 extends StObject {
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an enterprise,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Enforcing a policy for workflow permissions in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-policies-for-github-actions-in-your-enterprise#enforcing-a-policy-for-workflow-permissions-in-your-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    * GitHub Apps must have the `enterprise_administration:write` permission to use this endpoint.
    */
  var get: Responses200Content17
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an enterprise, and sets
    * whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Enforcing a policy for workflow permissions in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-policies-for-github-actions-in-your-enterprise#enforcing-a-policy-for-workflow-permissions-in-your-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    * GitHub Apps must have the `enterprise_administration:write` permission to use this endpoint.
    */
  var put: RequestBodyContent18
}
object GetResponses200Content17 {
  
  inline def apply(get: Responses200Content17, put: RequestBodyContent18): GetResponses200Content17 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content17]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content17] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content17): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent18): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
