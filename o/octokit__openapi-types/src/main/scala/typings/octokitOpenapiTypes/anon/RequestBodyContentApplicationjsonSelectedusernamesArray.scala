package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSelectedusernamesArray extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonSelectedusernamesArray
  
  var responses: `304404422`
}
object RequestBodyContentApplicationjsonSelectedusernamesArray {
  
  inline def apply(
    parameters: `47`,
    requestBody: ContentApplicationjsonSelectedusernamesArray,
    responses: `304404422`
  ): RequestBodyContentApplicationjsonSelectedusernamesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSelectedusernamesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonSelectedusernamesArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedusernamesArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
