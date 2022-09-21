package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200572 extends StObject {
  
  var parameters: `491`
  
  var responses: `200572`
}
object Responses200572 {
  
  inline def apply(parameters: `491`, responses: `200572`): Responses200572 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200572]
  }
  
  extension [Self <: Responses200572](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200572`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
