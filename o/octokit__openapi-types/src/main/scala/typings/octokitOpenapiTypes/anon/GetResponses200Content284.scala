package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content284 extends StObject {
  
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [Get repository content](https://docs.github.com/rest/reference/repos#get-repository-content), this method also supports [custom media types](https://docs.github.com/rest/overview/media-types) for retrieving the raw license content or rendered license HTML.
    */
  var get: Responses200Content284
}
object GetResponses200Content284 {
  
  inline def apply(get: Responses200Content284): GetResponses200Content284 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content284]
  }
  
  extension [Self <: GetResponses200Content284](x: Self) {
    
    inline def setGet(value: Responses200Content284): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
