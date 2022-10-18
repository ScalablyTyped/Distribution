package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content536 extends StObject {
  
  var get: Responses200Content536
  
  /** You can create a read-only deploy key. */
  var post: Responses201Content537
}
object GetResponses200Content536 {
  
  inline def apply(get: Responses200Content536, post: Responses201Content537): GetResponses200Content536 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content536]
  }
  
  extension [Self <: GetResponses200Content536](x: Self) {
    
    inline def setGet(value: Responses200Content536): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content537): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
