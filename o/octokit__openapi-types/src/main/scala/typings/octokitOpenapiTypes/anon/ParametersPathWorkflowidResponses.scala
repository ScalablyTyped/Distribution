package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathWorkflowidResponses extends StObject {
  
  var parameters: PathWorkflowid
}
object ParametersPathWorkflowidResponses {
  
  inline def apply(parameters: PathWorkflowid): ParametersPathWorkflowidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathWorkflowidResponses]
  }
  
  extension [Self <: ParametersPathWorkflowidResponses](x: Self) {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
