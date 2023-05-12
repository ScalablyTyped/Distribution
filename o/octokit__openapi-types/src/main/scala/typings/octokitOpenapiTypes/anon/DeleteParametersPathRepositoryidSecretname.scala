package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRepositoryidSecretname extends StObject {
  
  /**
    * Remove selected repository from an organization secret
    * @description Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  var delete: ParametersPathRepositoryidSecretname
  
  /**
    * Add selected repository to an organization secret
    * @description Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  var put: ParametersPathRepositoryidSecretname
}
object DeleteParametersPathRepositoryidSecretname {
  
  inline def apply(delete: ParametersPathRepositoryidSecretname, put: ParametersPathRepositoryidSecretname): DeleteParametersPathRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRepositoryidSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathRepositoryidSecretname] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRepositoryidSecretname): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRepositoryidSecretname): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
