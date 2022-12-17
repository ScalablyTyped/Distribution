package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content38 extends StObject {
  
  var get: Responses200Content38
  
  var post: Responses403404422
}
object GetResponses200Content38 {
  
  inline def apply(get: Responses200Content38, post: Responses403404422): GetResponses200Content38 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content38]
  }
  
  extension [Self <: GetResponses200Content38](x: Self) {
    
    inline def setGet(value: Responses200Content38): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses403404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
