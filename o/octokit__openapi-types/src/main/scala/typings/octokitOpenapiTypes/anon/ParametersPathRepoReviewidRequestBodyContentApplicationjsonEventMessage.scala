package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonEventMessage
  
  var responses: `200Content568404422`
}
object ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonEventMessage,
    responses: `200Content568404422`
  ): ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage]
  }
  
  extension [Self <: ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage](x: Self) {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEventMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content568404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
