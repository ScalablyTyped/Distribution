package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidQuery250 extends StObject {
  
  var parameters: PathRepoReviewidQuery250
  
  var responses: `200Content569`
}
object ParametersPathRepoReviewidQuery250 {
  
  inline def apply(parameters: PathRepoReviewidQuery250, responses: `200Content569`): ParametersPathRepoReviewidQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidQuery250]
  }
  
  extension [Self <: ParametersPathRepoReviewidQuery250](x: Self) {
    
    inline def setParameters(value: PathRepoReviewidQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content569`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
