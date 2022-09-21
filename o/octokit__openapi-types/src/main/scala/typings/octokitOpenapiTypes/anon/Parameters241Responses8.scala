package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters241Responses8 extends StObject {
  
  var parameters: `241`
  
  var responses: `8`
}
object Parameters241Responses8 {
  
  inline def apply(parameters: `241`, responses: `8`): Parameters241Responses8 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters241Responses8]
  }
  
  extension [Self <: Parameters241Responses8](x: Self) {
    
    inline def setParameters(value: `241`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
