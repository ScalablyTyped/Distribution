package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath615 extends StObject {
  
  /** Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope. */
  var delete: Responses616
  
  var get: ParametersPath615
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  var put: Responses616
}
object GetParametersPath615 {
  
  inline def apply(delete: Responses616, get: ParametersPath615, put: Responses616): GetParametersPath615 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath615]
  }
  
  extension [Self <: GetParametersPath615](x: Self) {
    
    inline def setDelete(value: Responses616): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath615): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses616): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
