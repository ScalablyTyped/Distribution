package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content45 extends StObject {
  
  var get: Responses200Content45
  
  var post: Responses403404422
}
object GetResponses200Content45 {
  
  inline def apply(get: Responses200Content45, post: Responses403404422): GetResponses200Content45 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content45]
  }
  
  extension [Self <: GetResponses200Content45](x: Self) {
    
    inline def setGet(value: Responses200Content45): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses403404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
