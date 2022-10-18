package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath259Responses extends StObject {
  
  /**
    * Forces the removal of a self-hosted runner from an enterprise. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPath259Responses
  
  /**
    * Gets a specific self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersPath259
}
object DeleteParametersPath259Responses {
  
  inline def apply(delete: ParametersPath259Responses, get: ParametersPath259): DeleteParametersPath259Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath259Responses]
  }
  
  extension [Self <: DeleteParametersPath259Responses](x: Self) {
    
    inline def setDelete(value: ParametersPath259Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath259): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
