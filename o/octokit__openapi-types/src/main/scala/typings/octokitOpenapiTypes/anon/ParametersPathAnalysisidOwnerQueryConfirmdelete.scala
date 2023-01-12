package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAnalysisidOwnerQueryConfirmdelete extends StObject {
  
  var parameters: PathAnalysisidOwnerQueryConfirmdelete
  
  var responses: `400403`
}
object ParametersPathAnalysisidOwnerQueryConfirmdelete {
  
  inline def apply(parameters: PathAnalysisidOwnerQueryConfirmdelete, responses: `400403`): ParametersPathAnalysisidOwnerQueryConfirmdelete = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAnalysisidOwnerQueryConfirmdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAnalysisidOwnerQueryConfirmdelete] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAnalysisidOwnerQueryConfirmdelete): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
