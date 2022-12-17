package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent extends StObject {
  
  var parameters: PathRepoReviewid
  
  var requestBody: ContentApplicationjsonEvent
  
  var responses: `200ContentApplicationjsonBodytextCommitid404Content48422Content395`
}
object ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent {
  
  inline def apply(
    parameters: PathRepoReviewid,
    requestBody: ContentApplicationjsonEvent,
    responses: `200ContentApplicationjsonBodytextCommitid404Content48422Content395`
  ): ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent]
  }
  
  extension [Self <: ParametersPathRepoReviewidRequestBodyContentApplicationjsonEvent](x: Self) {
    
    inline def setParameters(value: PathRepoReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytextCommitid404Content48422Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
