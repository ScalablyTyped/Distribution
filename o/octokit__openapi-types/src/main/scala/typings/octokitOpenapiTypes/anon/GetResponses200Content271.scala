package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content271 extends StObject {
  
  var get: Responses200Content271
  
  /** You can create a read-only deploy key. */
  var post: RequestBodyContentApplicationjsonReadonly
}
object GetResponses200Content271 {
  
  inline def apply(get: Responses200Content271, post: RequestBodyContentApplicationjsonReadonly): GetResponses200Content271 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content271]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content271] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content271): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonReadonly): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
