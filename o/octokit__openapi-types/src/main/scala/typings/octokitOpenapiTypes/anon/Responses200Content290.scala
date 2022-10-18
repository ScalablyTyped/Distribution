package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content290 extends StObject {
  
  var parameters: Path289
  
  var responses: `200Content290`
}
object Responses200Content290 {
  
  inline def apply(parameters: Path289, responses: `200Content290`): Responses200Content290 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content290]
  }
  
  extension [Self <: Responses200Content290](x: Self) {
    
    inline def setParameters(value: Path289): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content290`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
