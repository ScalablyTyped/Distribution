package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonLabelsurl extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonDueon
  
  var responses: `201ContentApplicationjsonLabelsurl`
}
object Responses201ContentApplicationjsonLabelsurl {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonDueon,
    responses: `201ContentApplicationjsonLabelsurl`
  ): Responses201ContentApplicationjsonLabelsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonLabelsurl]
  }
  
  extension [Self <: Responses201ContentApplicationjsonLabelsurl](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonLabelsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
