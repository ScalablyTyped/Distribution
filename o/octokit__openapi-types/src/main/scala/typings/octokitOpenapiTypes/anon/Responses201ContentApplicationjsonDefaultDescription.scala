package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonDefaultDescription extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonColorDescription
  
  var responses: `201ContentApplicationjsonDefaultDescription`
}
object Responses201ContentApplicationjsonDefaultDescription {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonColorDescription,
    responses: `201ContentApplicationjsonDefaultDescription`
  ): Responses201ContentApplicationjsonDefaultDescription = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonDefaultDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonDefaultDescription] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColorDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDefaultDescription`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
