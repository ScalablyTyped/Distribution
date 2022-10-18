package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content280 extends StObject {
  
  var get: Responses200Content280
  
  var post: Responses201304403404422
}
object GetResponses200Content280 {
  
  inline def apply(get: Responses200Content280, post: Responses201304403404422): GetResponses200Content280 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content280]
  }
  
  extension [Self <: GetResponses200Content280](x: Self) {
    
    inline def setGet(value: Responses200Content280): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304403404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
