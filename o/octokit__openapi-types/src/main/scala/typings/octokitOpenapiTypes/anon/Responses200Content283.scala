package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content283 extends StObject {
  
  var parameters: `144`
  
  var responses: `200Content283`
}
object Responses200Content283 {
  
  inline def apply(parameters: `144`, responses: `200Content283`): Responses200Content283 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content283]
  }
  
  extension [Self <: Responses200Content283](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content283`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
