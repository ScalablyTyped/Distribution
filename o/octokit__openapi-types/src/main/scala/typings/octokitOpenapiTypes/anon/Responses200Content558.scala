package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content558 extends StObject {
  
  var parameters: `491`
  
  var responses: `200Content558`
}
object Responses200Content558 {
  
  inline def apply(parameters: `491`, responses: `200Content558`): Responses200Content558 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content558]
  }
  
  extension [Self <: Responses200Content558](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content558`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
