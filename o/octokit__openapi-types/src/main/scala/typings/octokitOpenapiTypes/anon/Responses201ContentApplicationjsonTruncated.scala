package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonTruncated extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonBasetree
  
  var responses: `201ContentApplicationjsonTruncated`
}
object Responses201ContentApplicationjsonTruncated {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonBasetree,
    responses: `201ContentApplicationjsonTruncated`
  ): Responses201ContentApplicationjsonTruncated = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonTruncated]
  }
  
  extension [Self <: Responses201ContentApplicationjsonTruncated](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBasetree): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonTruncated`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
