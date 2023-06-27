package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content30 extends StObject {
  
  /** List gist forks */
  var get: Responses200Content30
  
  /** Fork a gist */
  var post: Responses403404422
}
object GetResponses200Content30 {
  
  inline def apply(get: Responses200Content30, post: Responses403404422): GetResponses200Content30 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content30]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content30] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content30): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses403404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
