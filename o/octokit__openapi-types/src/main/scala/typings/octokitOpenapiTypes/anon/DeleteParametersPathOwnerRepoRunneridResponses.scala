package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOwnerRepoRunneridResponses extends StObject {
  
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  var delete: ParametersPathOwnerRepoRunneridResponses
  
  /**
    * Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var get: ParametersPathOwnerRepoRunnerid
}
object DeleteParametersPathOwnerRepoRunneridResponses {
  
  inline def apply(delete: ParametersPathOwnerRepoRunneridResponses, get: ParametersPathOwnerRepoRunnerid): DeleteParametersPathOwnerRepoRunneridResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOwnerRepoRunneridResponses]
  }
  
  extension [Self <: DeleteParametersPathOwnerRepoRunneridResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathOwnerRepoRunneridResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerRepoRunnerid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
