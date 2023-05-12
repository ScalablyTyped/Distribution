package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content27 extends StObject {
  
  /** List gist forks */
  var get: Responses200Content27
  
  /** Fork a gist */
  var post: Responses403404422
}
object GetResponses200Content27 {
  
  inline def apply(get: Responses200Content27, post: Responses403404422): GetResponses200Content27 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content27]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content27] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content27): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses403404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
