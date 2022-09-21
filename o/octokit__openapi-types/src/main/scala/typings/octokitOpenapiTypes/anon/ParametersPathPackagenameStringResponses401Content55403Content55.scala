package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameStringResponses401Content55403Content55 extends StObject {
  
  var parameters: PathPackagenameString
  
  var responses: `401Content55403Content55`
}
object ParametersPathPackagenameStringResponses401Content55403Content55 {
  
  inline def apply(parameters: PathPackagenameString, responses: `401Content55403Content55`): ParametersPathPackagenameStringResponses401Content55403Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameStringResponses401Content55403Content55]
  }
  
  extension [Self <: ParametersPathPackagenameStringResponses401Content55403Content55](x: Self) {
    
    inline def setParameters(value: PathPackagenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content55403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
