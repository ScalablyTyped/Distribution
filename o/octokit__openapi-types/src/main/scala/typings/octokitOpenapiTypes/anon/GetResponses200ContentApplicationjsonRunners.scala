package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRunners extends StObject {
  
  /**
    * Lists the self-hosted runners that are in a specific enterprise group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonRunners
  
  /**
    * Replaces the list of self-hosted runners that are part of an enterprise runner group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonRunnersArray
}
object GetResponses200ContentApplicationjsonRunners {
  
  inline def apply(get: Responses200ContentApplicationjsonRunners, put: RequestBodyContentApplicationjsonRunnersArray): GetResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRunners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonRunners] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonRunners): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonRunnersArray): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
