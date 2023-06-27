package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786Responses200ContentApplicationjsonIncludedminutes extends StObject {
  
  var parameters: Path786
  
  var responses: `200ContentApplicationjsonIncludedminutes`
}
object ParametersPath786Responses200ContentApplicationjsonIncludedminutes {
  
  inline def apply(parameters: Path786, responses: `200ContentApplicationjsonIncludedminutes`): ParametersPath786Responses200ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786Responses200ContentApplicationjsonIncludedminutes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786Responses200ContentApplicationjsonIncludedminutes] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedminutes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
