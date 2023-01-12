package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonFailedreason extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonEmail
  
  var responses: `201ContentApplicationjsonFailedreason`
}
object Responses201ContentApplicationjsonFailedreason {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonEmail,
    responses: `201ContentApplicationjsonFailedreason`
  ): Responses201ContentApplicationjsonFailedreason = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonFailedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonFailedreason] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmail): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonFailedreason`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
