package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMeta extends StObject {
  
  var parameters: `591`
  
  var requestBody: ContentApplicationjsonOperations
  
  var responses: `200ContentApplicationjsonMeta`
}
object Responses200ContentApplicationjsonMeta {
  
  inline def apply(
    parameters: `591`,
    requestBody: ContentApplicationjsonOperations,
    responses: `200ContentApplicationjsonMeta`
  ): Responses200ContentApplicationjsonMeta = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMeta]
  }
  
  extension [Self <: Responses200ContentApplicationjsonMeta](x: Self) {
    
    inline def setParameters(value: `591`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOperations): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMeta`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
