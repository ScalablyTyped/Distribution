package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200400 extends StObject {
  
  var parameters: `144`
  
  var responses: `200400`
}
object Responses200400 {
  
  inline def apply(parameters: `144`, responses: `200400`): Responses200400 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200400]
  }
  
  extension [Self <: Responses200400](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
