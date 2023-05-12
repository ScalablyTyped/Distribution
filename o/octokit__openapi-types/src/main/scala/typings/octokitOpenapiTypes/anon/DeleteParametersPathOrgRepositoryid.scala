package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRepositoryid extends StObject {
  
  /**
    * Remove a selected repository from required workflow
    * @description Removes a repository from a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var delete: ParametersPathOrgRepositoryid
  
  /**
    * Add a repository to a required workflow
    * @description Adds a repository to a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var put: ParametersPathOrgRepositoryid
}
object DeleteParametersPathOrgRepositoryid {
  
  inline def apply(delete: ParametersPathOrgRepositoryid, put: ParametersPathOrgRepositoryid): DeleteParametersPathOrgRepositoryid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathOrgRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathOrgRepositoryid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOrgRepositoryid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
