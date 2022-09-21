package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidQuery426 extends StObject {
  
  var parameters: PathRepoReviewidQuery426
  
  var responses: `200Content570`
}
object ParametersPathRepoReviewidQuery426 {
  
  inline def apply(parameters: PathRepoReviewidQuery426, responses: `200Content570`): ParametersPathRepoReviewidQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidQuery426]
  }
  
  extension [Self <: ParametersPathRepoReviewidQuery426](x: Self) {
    
    inline def setParameters(value: PathRepoReviewidQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content570`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
