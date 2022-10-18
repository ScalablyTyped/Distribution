package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content282 extends StObject {
  
  /**
    * The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  var get: Responses200Content282
}
object GetResponses200Content282 {
  
  inline def apply(get: Responses200Content282): GetResponses200Content282 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content282]
  }
  
  extension [Self <: GetResponses200Content282](x: Self) {
    
    inline def setGet(value: Responses200Content282): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
