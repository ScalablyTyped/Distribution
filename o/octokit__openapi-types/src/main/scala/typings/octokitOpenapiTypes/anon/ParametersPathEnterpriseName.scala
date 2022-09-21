package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseName extends StObject {
  
  var parameters: PathEnterpriseName
  
  var responses: `404422`
}
object ParametersPathEnterpriseName {
  
  inline def apply(parameters: PathEnterpriseName, responses: `404422`): ParametersPathEnterpriseName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseName]
  }
  
  extension [Self <: ParametersPathEnterpriseName](x: Self) {
    
    inline def setParameters(value: PathEnterpriseName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
