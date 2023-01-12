package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOwnerRepoResponses extends StObject {
  
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  var delete: ParametersPathOwnerRepoResponses
  
  /**
    * Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var get: ParametersPathOwnerRepo
}
object DeleteParametersPathOwnerRepoResponses {
  
  inline def apply(delete: ParametersPathOwnerRepoResponses, get: ParametersPathOwnerRepo): DeleteParametersPathOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOwnerRepoResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathOwnerRepoResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathOwnerRepoResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
