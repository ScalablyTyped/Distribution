package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRepositoryidSecretname extends StObject {
  
  /** Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var delete: ParametersPathOrgRepositoryidSecretname
  
  /** Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var put: ParametersPathOrgRepositoryidSecretname
}
object DeleteParametersPathOrgRepositoryidSecretname {
  
  inline def apply(delete: ParametersPathOrgRepositoryidSecretname, put: ParametersPathOrgRepositoryidSecretname): DeleteParametersPathOrgRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRepositoryidSecretname]
  }
  
  extension [Self <: DeleteParametersPathOrgRepositoryidSecretname](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRepositoryidSecretname): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOrgRepositoryidSecretname): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
