package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content580 extends StObject {
  
  var parameters: `491`
  
  var responses: `200Content580`
}
object Responses200Content580 {
  
  inline def apply(parameters: `491`, responses: `200Content580`): Responses200Content580 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content580]
  }
  
  extension [Self <: Responses200Content580](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content580`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
