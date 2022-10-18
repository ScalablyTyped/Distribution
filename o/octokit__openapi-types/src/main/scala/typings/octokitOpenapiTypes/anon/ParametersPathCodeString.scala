package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCodeString extends StObject {
  
  var parameters: PathCodeString
  
  var responses: `201Content228`
}
object ParametersPathCodeString {
  
  inline def apply(parameters: PathCodeString, responses: `201Content228`): ParametersPathCodeString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCodeString]
  }
  
  extension [Self <: ParametersPathCodeString](x: Self) {
    
    inline def setParameters(value: PathCodeString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content228`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
