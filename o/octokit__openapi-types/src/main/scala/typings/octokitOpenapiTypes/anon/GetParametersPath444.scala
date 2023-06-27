package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath444 extends StObject {
  
  /**
    * Unfollow a user
    * @description Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  var delete: Responses445
  
  /** Check if a person is followed by the authenticated user */
  var get: ParametersPath444
  
  /**
    * Follow a user
    * @description Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  var put: Responses445
}
object GetParametersPath444 {
  
  inline def apply(delete: Responses445, get: ParametersPath444, put: Responses445): GetParametersPath444 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath444]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath444] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses445): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath444): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses445): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
