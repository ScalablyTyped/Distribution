package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content40304Unknown extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: ContentApplicationjsonPosition
  
  var responses: `201Content40304Unknown`
}
object Responses201Content40304Unknown {
  
  inline def apply(
    parameters: PathColumnidNumber,
    requestBody: ContentApplicationjsonPosition,
    responses: `201Content40304Unknown`
  ): Responses201Content40304Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content40304Unknown]
  }
  
  extension [Self <: Responses201Content40304Unknown](x: Self) {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPosition): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content40304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
