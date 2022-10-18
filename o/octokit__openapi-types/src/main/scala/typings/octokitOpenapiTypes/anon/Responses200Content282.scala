package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content282 extends StObject {
  
  var parameters: PathNameString
  
  var responses: `200Content282`
}
object Responses200Content282 {
  
  inline def apply(parameters: PathNameString, responses: `200Content282`): Responses200Content282 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content282]
  }
  
  extension [Self <: Responses200Content282](x: Self) {
    
    inline def setParameters(value: PathNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content282`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
