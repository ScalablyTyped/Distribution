package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameOwnerQuery extends StObject {
  
  /**
    * List custom deployment rule integrations available for an environment
    * @description Gets all custom deployment protection rule integrations that are available for an environment. Anyone with read access to the repository can use this endpoint. If the repository is private and you want to use a personal access token (classic), you must use an access token with the `repo` scope. GitHub Apps and fine-grained personal access tokens must have the `actions:read` permission to use this endpoint.
    *
    * For more information about environments, see "[Using environments for deployment](https://docs.github.com/en/actions/deployment/targeting-different-environments/using-environments-for-deployment)."
    *
    * For more information about the app that is providing this custom deployment rule, see "[GET an app](https://docs.github.com/rest/apps/apps#get-an-app)".
    */
  var get: ParametersPathEnvironmentnameOwnerQuery
}
object GetParametersPathEnvironmentnameOwnerQuery {
  
  inline def apply(get: ParametersPathEnvironmentnameOwnerQuery): GetParametersPathEnvironmentnameOwnerQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEnvironmentnameOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEnvironmentnameOwnerQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
