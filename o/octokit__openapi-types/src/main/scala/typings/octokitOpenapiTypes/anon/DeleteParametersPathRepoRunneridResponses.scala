package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRepoRunneridResponses extends StObject {
  
  /**
    * Delete a self-hosted runner from a repository
    * @description Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  var delete: ParametersPathRepoRunneridResponses
  
  /**
    * Get a self-hosted runner for a repository
    * @description Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var get: ParametersPathRepoRunnerid
}
object DeleteParametersPathRepoRunneridResponses {
  
  inline def apply(delete: ParametersPathRepoRunneridResponses, get: ParametersPathRepoRunnerid): DeleteParametersPathRepoRunneridResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRepoRunneridResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathRepoRunneridResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRepoRunneridResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoRunnerid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
