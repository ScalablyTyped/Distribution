package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content217 extends StObject {
  
  var parameters: `144`
  
  var responses: `200Content217`
}
object Responses200Content217 {
  
  inline def apply(parameters: `144`, responses: `200Content217`): Responses200Content217 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content217]
  }
  
  extension [Self <: Responses200Content217](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content217`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
