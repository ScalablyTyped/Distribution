package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses620 extends StObject {
  
  var parameters: Path599Query426
  
  var responses: `620`
}
object Responses620 {
  
  inline def apply(parameters: Path599Query426, responses: `620`): Responses620 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses620]
  }
  
  extension [Self <: Responses620](x: Self) {
    
    inline def setParameters(value: Path599Query426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `620`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
