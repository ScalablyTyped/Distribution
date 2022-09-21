package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content163 extends StObject {
  
  var parameters: `157`
  
  var responses: `200Content163`
}
object Responses200Content163 {
  
  inline def apply(parameters: `157`, responses: `200Content163`): Responses200Content163 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content163]
  }
  
  extension [Self <: Responses200Content163](x: Self) {
    
    inline def setParameters(value: `157`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content163`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
