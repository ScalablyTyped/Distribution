package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content93304 extends StObject {
  
  var parameters: `27`
  
  var responses: `200Content93304`
}
object Responses200Content93304 {
  
  inline def apply(parameters: `27`, responses: `200Content93304`): Responses200Content93304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content93304]
  }
  
  extension [Self <: Responses200Content93304](x: Self) {
    
    inline def setParameters(value: `27`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content93304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
