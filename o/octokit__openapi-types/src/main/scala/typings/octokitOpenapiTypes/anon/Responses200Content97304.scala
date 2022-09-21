package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content97304 extends StObject {
  
  var parameters: `34`
  
  var responses: `200Content97304`
}
object Responses200Content97304 {
  
  inline def apply(parameters: `34`, responses: `200Content97304`): Responses200Content97304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content97304]
  }
  
  extension [Self <: Responses200Content97304](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content97304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
