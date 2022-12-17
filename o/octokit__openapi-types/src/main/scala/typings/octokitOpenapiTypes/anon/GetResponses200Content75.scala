package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content75 extends StObject {
  
  var get: Responses200Content75
  
  /** Here's how you can create a hook that posts payloads in JSON format: */
  var post: RequestBodyContentApplicationjsonActive
}
object GetResponses200Content75 {
  
  inline def apply(get: Responses200Content75, post: RequestBodyContentApplicationjsonActive): GetResponses200Content75 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content75]
  }
  
  extension [Self <: GetResponses200Content75](x: Self) {
    
    inline def setGet(value: Responses200Content75): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonActive): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
