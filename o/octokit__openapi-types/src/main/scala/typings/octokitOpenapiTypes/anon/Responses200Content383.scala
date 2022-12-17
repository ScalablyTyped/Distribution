package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content383 extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `200Content383`
}
object Responses200Content383 {
  
  inline def apply(parameters: Path348QueryPage, responses: `200Content383`): Responses200Content383 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content383]
  }
  
  extension [Self <: Responses200Content383](x: Self) {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content383`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
