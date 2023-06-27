package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidResponses201Content63 extends StObject {
  
  var parameters: PathChecksuiteid
  
  var responses: `201Content63`
}
object ParametersPathChecksuiteidResponses201Content63 {
  
  inline def apply(parameters: PathChecksuiteid, responses: `201Content63`): ParametersPathChecksuiteidResponses201Content63 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidResponses201Content63]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidResponses201Content63] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
