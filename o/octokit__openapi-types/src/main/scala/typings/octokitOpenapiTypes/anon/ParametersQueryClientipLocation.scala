package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryClientipLocation extends StObject {
  
  var parameters: QueryClientipLocation
  
  var responses: `401403404500`
}
object ParametersQueryClientipLocation {
  
  inline def apply(parameters: QueryClientipLocation, responses: `401403404500`): ParametersQueryClientipLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryClientipLocation]
  }
  
  extension [Self <: ParametersQueryClientipLocation](x: Self) {
    
    inline def setParameters(value: QueryClientipLocation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
