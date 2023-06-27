package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoReviewidQuery extends StObject {
  
  var parameters: PathRepoReviewidQuery
  
  var responses: `200Content746`
}
object ParametersPathRepoReviewidQuery {
  
  inline def apply(parameters: PathRepoReviewidQuery, responses: `200Content746`): ParametersPathRepoReviewidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoReviewidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoReviewidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoReviewidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content746`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
