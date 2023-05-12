package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpage extends StObject {
  
  /**
    * List selected repositories for an organization secret
    * @description Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  var get: ParametersQueryPagePerpage
  
  /**
    * Set selected repositories for an organization secret
    * @description Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  var put: ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetParametersQueryPagePerpage {
  
  inline def apply(
    get: ParametersQueryPagePerpage,
    put: ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetParametersQueryPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathSecretnameRequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
