package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content263 extends StObject {
  
  var get: Responses200Content263
  
  var post: RequestBodyContentApplicationjsonColorDescription
}
object GetResponses200Content263 {
  
  inline def apply(get: Responses200Content263, post: RequestBodyContentApplicationjsonColorDescription): GetResponses200Content263 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content263]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content263] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content263): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonColorDescription): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
