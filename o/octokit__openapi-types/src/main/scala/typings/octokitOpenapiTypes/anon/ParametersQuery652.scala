package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery652 extends StObject {
  
  var parameters: Query652
  
  var responses: `200Content324Headers24`
}
object ParametersQuery652 {
  
  inline def apply(parameters: Query652, responses: `200Content324Headers24`): ParametersQuery652 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery652]
  }
  
  extension [Self <: ParametersQuery652](x: Self) {
    
    inline def setParameters(value: Query652): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content324Headers24`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
