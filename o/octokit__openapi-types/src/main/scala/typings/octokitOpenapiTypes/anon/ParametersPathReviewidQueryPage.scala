package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReviewidQueryPage extends StObject {
  
  var parameters: PathReviewidQueryPage
  
  var responses: `200Content326`
}
object ParametersPathReviewidQueryPage {
  
  inline def apply(parameters: PathReviewidQueryPage, responses: `200Content326`): ParametersPathReviewidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReviewidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReviewidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReviewidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content326`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
