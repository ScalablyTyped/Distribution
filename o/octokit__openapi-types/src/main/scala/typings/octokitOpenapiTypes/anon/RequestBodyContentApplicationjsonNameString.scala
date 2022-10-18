package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNameString extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `200ContentApplicationjsonCardsurl`
}
object RequestBodyContentApplicationjsonNameString {
  
  inline def apply(
    parameters: PathColumnidNumber,
    requestBody: ContentApplicationjsonNameString,
    responses: `200ContentApplicationjsonCardsurl`
  ): RequestBodyContentApplicationjsonNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNameString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNameString](x: Self) {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCardsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
