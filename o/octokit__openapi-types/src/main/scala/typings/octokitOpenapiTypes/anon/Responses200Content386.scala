package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content386 extends StObject {
  
  var parameters: PathAssetid
  
  var requestBody: js.UndefOr[ContentApplicationjsonLabel] = js.undefined
  
  var responses: `200Content386`
}
object Responses200Content386 {
  
  inline def apply(parameters: PathAssetid, responses: `200Content386`): Responses200Content386 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content386]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content386] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content386`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
