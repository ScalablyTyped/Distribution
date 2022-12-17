package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidQuery407 extends StObject {
  
  var parameters: PathRepoReviewidQuery407
  
  var responses: `200Content551`
}
object ParametersPathRepoReviewidQuery407 {
  
  inline def apply(parameters: PathRepoReviewidQuery407, responses: `200Content551`): ParametersPathRepoReviewidQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidQuery407]
  }
  
  extension [Self <: ParametersPathRepoReviewidQuery407](x: Self) {
    
    inline def setParameters(value: PathRepoReviewidQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content551`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
