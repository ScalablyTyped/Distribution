package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidQuery473 extends StObject {
  
  var parameters: PathRepoReviewidQuery473
  
  var responses: `200Content619`
}
object ParametersPathRepoReviewidQuery473 {
  
  inline def apply(parameters: PathRepoReviewidQuery473, responses: `200Content619`): ParametersPathRepoReviewidQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoReviewidQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoReviewidQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content619`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
