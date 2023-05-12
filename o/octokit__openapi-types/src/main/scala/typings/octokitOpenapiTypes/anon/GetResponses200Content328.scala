package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content328 extends StObject {
  
  /**
    * Get a repository README
    * @description Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://docs.github.com/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  var get: Responses200Content328
}
object GetResponses200Content328 {
  
  inline def apply(get: Responses200Content328): GetResponses200Content328 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content328]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content328] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content328): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
