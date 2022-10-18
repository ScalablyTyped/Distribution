package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath325Responses404Unknown extends StObject {
  
  var delete: ParametersPath325Responses
  
  var get: ParametersPath325Responses404Unknown
  
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: Responses342
}
object GetParametersPath325Responses404Unknown {
  
  inline def apply(delete: ParametersPath325Responses, get: ParametersPath325Responses404Unknown, put: Responses342): GetParametersPath325Responses404Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath325Responses404Unknown]
  }
  
  extension [Self <: GetParametersPath325Responses404Unknown](x: Self) {
    
    inline def setDelete(value: ParametersPath325Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath325Responses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses342): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
