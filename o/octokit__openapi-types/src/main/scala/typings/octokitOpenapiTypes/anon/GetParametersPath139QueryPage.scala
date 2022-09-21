package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath139QueryPage extends StObject {
  
  var get: ParametersPath139QueryPage
  
  var post: Responses201304401403
}
object GetParametersPath139QueryPage {
  
  inline def apply(get: ParametersPath139QueryPage, post: Responses201304401403): GetParametersPath139QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath139QueryPage]
  }
  
  extension [Self <: GetParametersPath139QueryPage](x: Self) {
    
    inline def setGet(value: ParametersPath139QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304401403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
