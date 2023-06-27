package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwner extends StObject {
  
  var parameters: PathChecksuiteidOwner
  
  var responses: `664`
}
object ParametersPathChecksuiteidOwner {
  
  inline def apply(parameters: PathChecksuiteidOwner, responses: `664`): ParametersPathChecksuiteidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `664`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
