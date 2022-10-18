package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content332 extends StObject {
  
  var get: Responses200Content332
  
  /** Here's how you can create a hook that posts payloads in JSON format: */
  var post: RequestBodyContentApplicationjsonActiveConfigEvents
}
object GetResponses200Content332 {
  
  inline def apply(get: Responses200Content332, post: RequestBodyContentApplicationjsonActiveConfigEvents): GetResponses200Content332 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content332]
  }
  
  extension [Self <: GetResponses200Content332](x: Self) {
    
    inline def setGet(value: Responses200Content332): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonActiveConfigEvents): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
