package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReviewid extends StObject {
  
  var parameters: PathReviewid
  
  var responses: `200Content310404`
}
object ParametersPathReviewid {
  
  inline def apply(parameters: PathReviewid, responses: `200Content310404`): ParametersPathReviewid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReviewid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReviewid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content310404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
