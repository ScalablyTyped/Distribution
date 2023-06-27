package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRequiredworkflowid extends StObject {
  
  var parameters: PathRequiredworkflowid
  
  var responses: `200Content68`
}
object ParametersPathRequiredworkflowid {
  
  inline def apply(parameters: PathRequiredworkflowid, responses: `200Content68`): ParametersPathRequiredworkflowid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content68`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
