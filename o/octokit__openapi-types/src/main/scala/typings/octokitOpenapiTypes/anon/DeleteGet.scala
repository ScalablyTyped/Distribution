package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGet extends StObject {
  
  /**
    * Deletes a self-hosted runner group for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathRunnergroupidResponses
  
  /**
    * Gets a specific self-hosted runner group for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersPathRunnergroupid
  
  /**
    * Updates the `name` and `visibility` of a self-hosted runner group in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonName
}
object DeleteGet {
  
  inline def apply(
    delete: ParametersPathRunnergroupidResponses,
    get: ParametersPathRunnergroupid,
    patch: RequestBodyContentApplicationjsonName
  ): DeleteGet = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGet] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRunnergroupidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRunnergroupid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonName): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
