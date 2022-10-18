package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content531404 extends StObject {
  
  var get: Responses200Content531404
  
  var post: Responses201Content539
}
object GetResponses200Content531404 {
  
  inline def apply(get: Responses200Content531404, post: Responses201Content539): GetResponses200Content531404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content531404]
  }
  
  extension [Self <: GetResponses200Content531404](x: Self) {
    
    inline def setGet(value: Responses200Content531404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content539): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
