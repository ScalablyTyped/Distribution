package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content277 extends StObject {
  
  var get: Responses200Content277
  
  /** You can create a read-only deploy key. */
  var post: RequestBodyContentApplicationjsonReadonly
}
object GetResponses200Content277 {
  
  inline def apply(get: Responses200Content277, post: RequestBodyContentApplicationjsonReadonly): GetResponses200Content277 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content277]
  }
  
  extension [Self <: GetResponses200Content277](x: Self) {
    
    inline def setGet(value: Responses200Content277): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonReadonly): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
