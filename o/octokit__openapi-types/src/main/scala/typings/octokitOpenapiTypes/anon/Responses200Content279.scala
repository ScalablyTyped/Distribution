package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content279 extends StObject {
  
  var parameters: Path273Query250
  
  var responses: `200Content279`
}
object Responses200Content279 {
  
  inline def apply(parameters: Path273Query250, responses: `200Content279`): Responses200Content279 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content279]
  }
  
  extension [Self <: Responses200Content279](x: Self) {
    
    inline def setParameters(value: Path273Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content279`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
