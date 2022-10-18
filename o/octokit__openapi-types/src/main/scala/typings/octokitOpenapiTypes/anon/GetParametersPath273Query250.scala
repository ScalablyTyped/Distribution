package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath273Query250 extends StObject {
  
  var get: ParametersPath273Query250
  
  var post: Responses201Content277
}
object GetParametersPath273Query250 {
  
  inline def apply(get: ParametersPath273Query250, post: Responses201Content277): GetParametersPath273Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath273Query250]
  }
  
  extension [Self <: GetParametersPath273Query250](x: Self) {
    
    inline def setGet(value: ParametersPath273Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content277): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
