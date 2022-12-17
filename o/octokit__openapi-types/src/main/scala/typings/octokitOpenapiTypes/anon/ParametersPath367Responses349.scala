package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath367Responses349 extends StObject {
  
  var parameters: Path367
  
  var responses: `349`
}
object ParametersPath367Responses349 {
  
  inline def apply(parameters: Path367, responses: `349`): ParametersPath367Responses349 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath367Responses349]
  }
  
  extension [Self <: ParametersPath367Responses349](x: Self) {
    
    inline def setParameters(value: Path367): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
