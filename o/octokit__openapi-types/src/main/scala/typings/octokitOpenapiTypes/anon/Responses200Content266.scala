package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content266 extends StObject {
  
  var parameters: Query250
  
  var responses: `200Content266`
}
object Responses200Content266 {
  
  inline def apply(parameters: Query250, responses: `200Content266`): Responses200Content266 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content266]
  }
  
  extension [Self <: Responses200Content266](x: Self) {
    
    inline def setParameters(value: Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content266`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
