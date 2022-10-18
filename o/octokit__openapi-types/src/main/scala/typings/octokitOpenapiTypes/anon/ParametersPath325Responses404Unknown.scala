package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath325Responses404Unknown extends StObject {
  
  var parameters: Path325
  
  var responses: `404Unknown`
}
object ParametersPath325Responses404Unknown {
  
  inline def apply(parameters: Path325, responses: `404Unknown`): ParametersPath325Responses404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath325Responses404Unknown]
  }
  
  extension [Self <: ParametersPath325Responses404Unknown](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
