package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCardsurl304 extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: ContentApplicationjsonName
  
  var responses: `200ContentApplicationjsonCardsurl304`
}
object Responses200ContentApplicationjsonCardsurl304 {
  
  inline def apply(
    parameters: PathColumnidNumber,
    requestBody: ContentApplicationjsonName,
    responses: `200ContentApplicationjsonCardsurl304`
  ): Responses200ContentApplicationjsonCardsurl304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCardsurl304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonCardsurl304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCardsurl304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
