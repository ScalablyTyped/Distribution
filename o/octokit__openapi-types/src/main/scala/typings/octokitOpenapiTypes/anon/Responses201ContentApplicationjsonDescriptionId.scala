package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonDescriptionId extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonColorDescription
  
  var responses: `201ContentApplicationjsonDescriptionId`
}
object Responses201ContentApplicationjsonDescriptionId {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonColorDescription,
    responses: `201ContentApplicationjsonDescriptionId`
  ): Responses201ContentApplicationjsonDescriptionId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonDescriptionId]
  }
  
  extension [Self <: Responses201ContentApplicationjsonDescriptionId](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColorDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDescriptionId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
