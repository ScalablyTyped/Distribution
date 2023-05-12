package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content278 extends StObject {
  
  /** List labels for a repository */
  var get: Responses200Content278
  
  /** Create a label */
  var post: RequestBodyContentApplicationjsonColorDescription
}
object GetResponses200Content278 {
  
  inline def apply(get: Responses200Content278, post: RequestBodyContentApplicationjsonColorDescription): GetResponses200Content278 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content278]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content278] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content278): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonColorDescription): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
