package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters496RequestBodyContentApplicationjsonSelectedusernamesArray extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonSelectedusernamesArray
  
  var responses: `304404422500`
}
object Parameters496RequestBodyContentApplicationjsonSelectedusernamesArray {
  
  inline def apply(
    parameters: `496`,
    requestBody: ContentApplicationjsonSelectedusernamesArray,
    responses: `304404422500`
  ): Parameters496RequestBodyContentApplicationjsonSelectedusernamesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters496RequestBodyContentApplicationjsonSelectedusernamesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters496RequestBodyContentApplicationjsonSelectedusernamesArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedusernamesArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
