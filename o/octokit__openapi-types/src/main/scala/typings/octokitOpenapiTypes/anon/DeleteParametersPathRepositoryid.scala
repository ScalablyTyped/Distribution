package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRepositoryid extends StObject {
  
  /** Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var delete: ParametersPathRepositoryid
  
  /** Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var put: ParametersPathRepositoryid
}
object DeleteParametersPathRepositoryid {
  
  inline def apply(delete: ParametersPathRepositoryid, put: ParametersPathRepositoryid): DeleteParametersPathRepositoryid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRepositoryid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRepositoryid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
