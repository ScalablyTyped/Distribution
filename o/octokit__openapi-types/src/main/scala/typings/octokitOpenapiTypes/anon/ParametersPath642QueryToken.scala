package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath642QueryToken extends StObject {
  
  var parameters: Path642QueryToken
  
  var responses: `354`
}
object ParametersPath642QueryToken {
  
  inline def apply(parameters: Path642QueryToken, responses: `354`): ParametersPath642QueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath642QueryToken]
  }
  
  extension [Self <: ParametersPath642QueryToken](x: Self) {
    
    inline def setParameters(value: Path642QueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
