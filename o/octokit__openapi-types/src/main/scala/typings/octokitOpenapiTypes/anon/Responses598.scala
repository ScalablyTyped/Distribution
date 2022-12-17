package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses598 extends StObject {
  
  var parameters: Path577Query407
  
  var responses: `598`
}
object Responses598 {
  
  inline def apply(parameters: Path577Query407, responses: `598`): Responses598 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses598]
  }
  
  extension [Self <: Responses598](x: Self) {
    
    inline def setParameters(value: Path577Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `598`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
