package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath386Responses297 extends StObject {
  
  var parameters: Path386
  
  var responses: `297`
}
object ParametersPath386Responses297 {
  
  inline def apply(parameters: Path386, responses: `297`): ParametersPath386Responses297 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath386Responses297]
  }
  
  extension [Self <: ParametersPath386Responses297](x: Self) {
    
    inline def setParameters(value: Path386): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `297`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
