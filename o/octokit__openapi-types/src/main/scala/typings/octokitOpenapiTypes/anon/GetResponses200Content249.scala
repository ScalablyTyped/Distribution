package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content249 extends StObject {
  
  /**
    * List commit comments for a repository
    * @description Commit Comments use [these custom media types](https://docs.github.com/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/rest/overview/media-types/).
    *
    * Comments are ordered by ascending ID.
    */
  var get: Responses200Content249
}
object GetResponses200Content249 {
  
  inline def apply(get: Responses200Content249): GetResponses200Content249 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content249]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content249] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content249): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
