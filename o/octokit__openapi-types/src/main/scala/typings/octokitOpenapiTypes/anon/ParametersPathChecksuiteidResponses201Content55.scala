package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidResponses201Content55 extends StObject {
  
  var parameters: PathChecksuiteid
  
  var responses: `201Content55`
}
object ParametersPathChecksuiteidResponses201Content55 {
  
  inline def apply(parameters: PathChecksuiteid, responses: `201Content55`): ParametersPathChecksuiteidResponses201Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidResponses201Content55]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidResponses201Content55] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
