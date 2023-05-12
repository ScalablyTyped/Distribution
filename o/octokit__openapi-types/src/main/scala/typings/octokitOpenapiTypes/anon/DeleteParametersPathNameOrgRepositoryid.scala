package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameOrgRepositoryid extends StObject {
  
  /**
    * Remove selected repository from an organization variable
    * @description Removes a repository from an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var delete: ParametersPathNameOrgRepositoryid
  
  /**
    * Add selected repository to an organization variable
    * @description Adds a repository to an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var put: ParametersPathNameOrgRepositoryid
}
object DeleteParametersPathNameOrgRepositoryid {
  
  inline def apply(delete: ParametersPathNameOrgRepositoryid, put: ParametersPathNameOrgRepositoryid): DeleteParametersPathNameOrgRepositoryid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameOrgRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathNameOrgRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathNameOrgRepositoryid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathNameOrgRepositoryid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
