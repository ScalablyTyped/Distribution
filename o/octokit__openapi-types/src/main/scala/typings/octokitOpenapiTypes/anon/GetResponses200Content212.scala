package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content212 extends StObject {
  
  /**
    * List commit comments for a repository
    * @description Commit Comments use [these custom media types](https://docs.github.com/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/rest/overview/media-types/).
    *
    * Comments are ordered by ascending ID.
    */
  var get: Responses200Content212
}
object GetResponses200Content212 {
  
  inline def apply(get: Responses200Content212): GetResponses200Content212 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content212]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content212] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content212): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
