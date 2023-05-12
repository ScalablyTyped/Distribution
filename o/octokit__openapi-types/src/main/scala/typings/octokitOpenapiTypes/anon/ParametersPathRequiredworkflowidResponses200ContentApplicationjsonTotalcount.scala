package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount extends StObject {
  
  var parameters: PathRequiredworkflowid
  
  var responses: `200ContentApplicationjsonTotalcount`
}
object ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount {
  
  inline def apply(parameters: PathRequiredworkflowid, responses: `200ContentApplicationjsonTotalcount`): ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
