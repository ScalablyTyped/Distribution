package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReviewidQuery extends StObject {
  
  var parameters: PathReviewidQuery
  
  var responses: `200Content381`
}
object ParametersPathReviewidQuery {
  
  inline def apply(parameters: PathReviewidQuery, responses: `200Content381`): ParametersPathReviewidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReviewidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReviewidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReviewidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content381`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
