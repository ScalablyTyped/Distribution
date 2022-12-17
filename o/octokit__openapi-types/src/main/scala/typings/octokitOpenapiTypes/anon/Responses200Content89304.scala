package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content89304 extends StObject {
  
  var parameters: `27`
  
  var responses: `200Content89304`
}
object Responses200Content89304 {
  
  inline def apply(parameters: `27`, responses: `200Content89304`): Responses200Content89304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content89304]
  }
  
  extension [Self <: Responses200Content89304](x: Self) {
    
    inline def setParameters(value: `27`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content89304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
