package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameOwner extends StObject {
  
  /**
    * Get all deployment protection rules for an environment
    * @description Gets all custom deployment protection rules that are enabled for an environment. Anyone with read access to the repository can use this endpoint. If the repository is private and you want to use a personal access token (classic), you must use an access token with the `repo` scope. GitHub Apps and fine-grained personal access tokens must have the `actions:read` permission to use this endpoint. For more information about environments, see "[Using environments for deployment](https://docs.github.com/en/actions/deployment/targeting-different-environments/using-environments-for-deployment)."
    *
    * For more information about the app that is providing this custom deployment rule, see the [documentation for the `GET /apps/{app_slug}` endpoint](https://docs.github.com/rest/apps/apps#get-an-app).
    */
  var get: ParametersPathEnvironmentnameOwner
  
  /**
    * Create a custom deployment protection rule on an environment
    * @description Enable a custom deployment protection rule for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. Enabling a custom protection rule requires admin or owner permissions to the repository. GitHub Apps must have the `actions:write` permission to use this endpoint.
    *
    * For more information about the app that is providing this custom deployment rule, see the [documentation for the `GET /apps/{app_slug}` endpoint](https://docs.github.com/rest/apps/apps#get-an-app).
    */
  var post: RequestBodyContentApplicationjsonIntegrationid
}
object GetParametersPathEnvironmentnameOwner {
  
  inline def apply(get: ParametersPathEnvironmentnameOwner, post: RequestBodyContentApplicationjsonIntegrationid): GetParametersPathEnvironmentnameOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEnvironmentnameOwner] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEnvironmentnameOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonIntegrationid): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
