package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNames404Content48 extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonNames
  
  var responses: `200ContentApplicationjsonNames404Content48`
}
object Responses200ContentApplicationjsonNames404Content48 {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonNames,
    responses: `200ContentApplicationjsonNames404Content48`
  ): Responses200ContentApplicationjsonNames404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNames404Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonNames404Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNames): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
