package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content153 extends StObject {
  
  var parameters: `147`
  
  var responses: `200Content153`
}
object Responses200Content153 {
  
  inline def apply(parameters: `147`, responses: `200Content153`): Responses200Content153 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content153]
  }
  
  extension [Self <: Responses200Content153](x: Self) {
    
    inline def setParameters(value: `147`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content153`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
