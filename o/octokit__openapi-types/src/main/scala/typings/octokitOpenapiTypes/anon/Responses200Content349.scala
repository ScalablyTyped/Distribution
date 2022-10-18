package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content349 extends StObject {
  
  var parameters: Path607Query250
  
  var responses: `200Content349`
}
object Responses200Content349 {
  
  inline def apply(parameters: Path607Query250, responses: `200Content349`): Responses200Content349 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content349]
  }
  
  extension [Self <: Responses200Content349](x: Self) {
    
    inline def setParameters(value: Path607Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
