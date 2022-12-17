package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRepositoryid extends StObject {
  
  /**
    * Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var delete: ParametersPathOrgRepositoryid
  
  /**
    * Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: ParametersPathOrgRepositoryid
}
object DeleteParametersPathOrgRepositoryid {
  
  inline def apply(delete: ParametersPathOrgRepositoryid, put: ParametersPathOrgRepositoryid): DeleteParametersPathOrgRepositoryid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRepositoryid]
  }
  
  extension [Self <: DeleteParametersPathOrgRepositoryid](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRepositoryid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOrgRepositoryid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
