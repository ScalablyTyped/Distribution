package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryResolution extends StObject {
  
  var parameters: QueryResolution
  
  var responses: `404503`
}
object ParametersQueryResolution {
  
  inline def apply(parameters: QueryResolution, responses: `404503`): ParametersQueryResolution = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryResolution]
  }
  
  extension [Self <: ParametersQueryResolution](x: Self) {
    
    inline def setParameters(value: QueryResolution): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
