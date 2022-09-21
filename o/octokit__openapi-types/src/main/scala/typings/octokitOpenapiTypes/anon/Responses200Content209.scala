package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content209 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content209`
}
object Responses200Content209 {
  
  inline def apply(parameters: PathOwner, responses: `200Content209`): Responses200Content209 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content209]
  }
  
  extension [Self <: Responses200Content209](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content209`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
