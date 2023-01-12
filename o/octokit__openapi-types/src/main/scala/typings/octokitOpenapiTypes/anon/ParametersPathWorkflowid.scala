package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathWorkflowid extends StObject {
  
  var parameters: PathWorkflowid
  
  var responses: `200Content155`
}
object ParametersPathWorkflowid {
  
  inline def apply(parameters: PathWorkflowid, responses: `200Content155`): ParametersPathWorkflowid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathWorkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathWorkflowid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content155`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
