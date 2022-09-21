package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteid extends StObject {
  
  var parameters: PathChecksuiteid
  
  var responses: `187`
}
object ParametersPathChecksuiteid {
  
  inline def apply(parameters: PathChecksuiteid, responses: `187`): ParametersPathChecksuiteid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteid]
  }
  
  extension [Self <: ParametersPathChecksuiteid](x: Self) {
    
    inline def setParameters(value: PathChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `187`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
