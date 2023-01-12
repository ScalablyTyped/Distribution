package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath130QueryPage extends StObject {
  
  var get: ParametersPath130QueryPage
  
  var post: Responses201304401403
}
object GetParametersPath130QueryPage {
  
  inline def apply(get: ParametersPath130QueryPage, post: Responses201304401403): GetParametersPath130QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath130QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath130QueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath130QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304401403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
