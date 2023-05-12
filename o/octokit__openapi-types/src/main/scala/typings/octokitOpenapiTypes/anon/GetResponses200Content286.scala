package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content286 extends StObject {
  
  /** List deploy keys */
  var get: Responses200Content286
  
  /**
    * Create a deploy key
    * @description You can create a read-only deploy key.
    */
  var post: RequestBodyContentApplicationjsonReadonly
}
object GetResponses200Content286 {
  
  inline def apply(get: Responses200Content286, post: RequestBodyContentApplicationjsonReadonly): GetResponses200Content286 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content286]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content286] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content286): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonReadonly): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
