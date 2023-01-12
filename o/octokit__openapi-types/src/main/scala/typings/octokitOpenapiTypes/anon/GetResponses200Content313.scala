package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content313 extends StObject {
  
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  var get: Responses200Content313
}
object GetResponses200Content313 {
  
  inline def apply(get: Responses200Content313): GetResponses200Content313 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content313]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content313] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content313): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
