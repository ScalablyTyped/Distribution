package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAuthorscount503Content36 extends StObject {
  
  var parameters: `540`
  
  var requestBody: js.UndefOr[Content261] = js.undefined
  
  var responses: `200ContentApplicationjsonAuthorscount503Content36`
}
object Responses200ContentApplicationjsonAuthorscount503Content36 {
  
  inline def apply(parameters: `540`, responses: `200ContentApplicationjsonAuthorscount503Content36`): Responses200ContentApplicationjsonAuthorscount503Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAuthorscount503Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonAuthorscount503Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content261): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonAuthorscount503Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
