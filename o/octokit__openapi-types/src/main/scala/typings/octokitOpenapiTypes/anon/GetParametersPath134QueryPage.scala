package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath134QueryPage extends StObject {
  
  /** List project columns */
  var get: ParametersPath134QueryPage
  
  /** Create a project column */
  var post: Responses201304401403
}
object GetParametersPath134QueryPage {
  
  inline def apply(get: ParametersPath134QueryPage, post: Responses201304401403): GetParametersPath134QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath134QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath134QueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath134QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304401403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
