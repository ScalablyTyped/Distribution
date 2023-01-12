package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCardsurl304Unknown extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `200ContentApplicationjsonCardsurl304Unknown`
}
object Responses200ContentApplicationjsonCardsurl304Unknown {
  
  inline def apply(
    parameters: PathColumnidNumber,
    requestBody: ContentApplicationjsonNameString,
    responses: `200ContentApplicationjsonCardsurl304Unknown`
  ): Responses200ContentApplicationjsonCardsurl304Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCardsurl304Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonCardsurl304Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCardsurl304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
