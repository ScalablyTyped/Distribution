package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content466 extends StObject {
  
  /**
    * Commit Comments use [these custom media types](https://docs.github.com/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/rest/overview/media-types/).
    *
    * Comments are ordered by ascending ID.
    */
  var get: Responses200Content466
}
object GetResponses200Content466 {
  
  inline def apply(get: Responses200Content466): GetResponses200Content466 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content466]
  }
  
  extension [Self <: GetResponses200Content466](x: Self) {
    
    inline def setGet(value: Responses200Content466): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
