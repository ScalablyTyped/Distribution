package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAuthorscount503Content41 extends StObject {
  
  var parameters: `639`
  
  var requestBody: js.UndefOr[Content309] = js.undefined
  
  var responses: `200ContentApplicationjsonAuthorscount503Content41`
}
object Responses200ContentApplicationjsonAuthorscount503Content41 {
  
  inline def apply(parameters: `639`, responses: `200ContentApplicationjsonAuthorscount503Content41`): Responses200ContentApplicationjsonAuthorscount503Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAuthorscount503Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAuthorscount503Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content309): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonAuthorscount503Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
