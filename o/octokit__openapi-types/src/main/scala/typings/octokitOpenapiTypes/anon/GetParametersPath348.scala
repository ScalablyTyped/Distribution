package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath348 extends StObject {
  
  /** Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope. */
  var delete: Responses349
  
  var get: ParametersPath348
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  var put: Responses349
}
object GetParametersPath348 {
  
  inline def apply(delete: Responses349, get: ParametersPath348, put: Responses349): GetParametersPath348 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath348]
  }
  
  extension [Self <: GetParametersPath348](x: Self) {
    
    inline def setDelete(value: Responses349): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath348): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses349): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
