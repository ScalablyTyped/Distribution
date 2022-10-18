package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery378 extends StObject {
  
  var parameters: Query378
  
  var responses: `351`
}
object ParametersQuery378 {
  
  inline def apply(parameters: Query378, responses: `351`): ParametersQuery378 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery378]
  }
  
  extension [Self <: ParametersQuery378](x: Self) {
    
    inline def setParameters(value: Query378): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `351`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
