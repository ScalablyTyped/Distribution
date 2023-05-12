package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwnerResponses506 extends StObject {
  
  var parameters: PathChecksuiteidOwner
  
  var responses: `506`
}
object ParametersPathChecksuiteidOwnerResponses506 {
  
  inline def apply(parameters: PathChecksuiteidOwner, responses: `506`): ParametersPathChecksuiteidOwnerResponses506 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwnerResponses506]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidOwnerResponses506] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
