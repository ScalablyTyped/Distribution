package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameStringQueryToken extends StObject {
  
  var parameters: PathPackagenameStringQueryToken
  
  var responses: `401Content48403Content48`
}
object ParametersPathPackagenameStringQueryToken {
  
  inline def apply(parameters: PathPackagenameStringQueryToken, responses: `401Content48403Content48`): ParametersPathPackagenameStringQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameStringQueryToken]
  }
  
  extension [Self <: ParametersPathPackagenameStringQueryToken](x: Self) {
    
    inline def setParameters(value: PathPackagenameStringQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content48403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
