package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwnerResponses590 extends StObject {
  
  var parameters: PathChecksuiteidOwner
  
  var responses: `590`
}
object ParametersPathChecksuiteidOwnerResponses590 {
  
  inline def apply(parameters: PathChecksuiteidOwner, responses: `590`): ParametersPathChecksuiteidOwnerResponses590 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwnerResponses590]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidOwnerResponses590] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
