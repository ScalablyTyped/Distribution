package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAppslugString extends StObject {
  
  var parameters: PathAppslugString
  
  var responses: `403Content48`
}
object ParametersPathAppslugString {
  
  inline def apply(parameters: PathAppslugString, responses: `403Content48`): ParametersPathAppslugString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAppslugString]
  }
  
  extension [Self <: ParametersPathAppslugString](x: Self) {
    
    inline def setParameters(value: PathAppslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
