package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryBaseDirection extends StObject {
  
  var parameters: QueryBaseDirection
  
  var responses: `304422`
}
object ParametersQueryBaseDirection {
  
  inline def apply(parameters: QueryBaseDirection, responses: `304422`): ParametersQueryBaseDirection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryBaseDirection]
  }
  
  extension [Self <: ParametersQueryBaseDirection](x: Self) {
    
    inline def setParameters(value: QueryBaseDirection): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
