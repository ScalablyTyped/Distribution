package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content280 extends StObject {
  
  var parameters: Path273Query250
  
  var responses: `200Content280`
}
object Responses200Content280 {
  
  inline def apply(parameters: Path273Query250, responses: `200Content280`): Responses200Content280 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content280]
  }
  
  extension [Self <: Responses200Content280](x: Self) {
    
    inline def setParameters(value: Path273Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content280`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
