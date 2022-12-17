package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRepositoryidResponses409Unknown extends StObject {
  
  /** Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint. */
  var delete: ParametersPathRepositoryidResponses409Unknown
  
  /** Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint. */
  var put: ParametersPathRepositoryidResponses409Unknown
}
object DeleteParametersPathRepositoryidResponses409Unknown {
  
  inline def apply(
    delete: ParametersPathRepositoryidResponses409Unknown,
    put: ParametersPathRepositoryidResponses409Unknown
  ): DeleteParametersPathRepositoryidResponses409Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRepositoryidResponses409Unknown]
  }
  
  extension [Self <: DeleteParametersPathRepositoryidResponses409Unknown](x: Self) {
    
    inline def setDelete(value: ParametersPathRepositoryidResponses409Unknown): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRepositoryidResponses409Unknown): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
