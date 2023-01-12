package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCardsurl extends StObject {
  
  var parameters: PathProjectidNumber
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `201ContentApplicationjsonCardsurl`
}
object Responses201ContentApplicationjsonCardsurl {
  
  inline def apply(
    parameters: PathProjectidNumber,
    requestBody: ContentApplicationjsonNameString,
    responses: `201ContentApplicationjsonCardsurl`
  ): Responses201ContentApplicationjsonCardsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCardsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonCardsurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCardsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
