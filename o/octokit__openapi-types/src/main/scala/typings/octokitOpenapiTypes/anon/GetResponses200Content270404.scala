package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content270404 extends StObject {
  
  var get: Responses200Content270404
  
  var post: RequestBodyContentApplicationjsonColorDescription
}
object GetResponses200Content270404 {
  
  inline def apply(get: Responses200Content270404, post: RequestBodyContentApplicationjsonColorDescription): GetResponses200Content270404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content270404]
  }
  
  extension [Self <: GetResponses200Content270404](x: Self) {
    
    inline def setGet(value: Responses200Content270404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonColorDescription): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
