package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnablement extends StObject {
  
  var parameters: PathEnablement
  
  var responses: `422Unknown`
}
object ParametersPathEnablement {
  
  inline def apply(parameters: PathEnablement, responses: `422Unknown`): ParametersPathEnablement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnablement]
  }
  
  extension [Self <: ParametersPathEnablement](x: Self) {
    
    inline def setParameters(value: PathEnablement): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
