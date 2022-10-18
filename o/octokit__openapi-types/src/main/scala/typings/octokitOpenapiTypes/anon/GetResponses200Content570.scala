package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content570 extends StObject {
  
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  var get: Responses200Content570
}
object GetResponses200Content570 {
  
  inline def apply(get: Responses200Content570): GetResponses200Content570 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content570]
  }
  
  extension [Self <: GetResponses200Content570](x: Self) {
    
    inline def setGet(value: Responses200Content570): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
