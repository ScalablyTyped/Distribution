package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401Content48403Content48404Content48 extends StObject {
  
  var parameters: Path577
  
  var responses: `401Content48403Content48404Content48`
}
object Responses401Content48403Content48404Content48 {
  
  inline def apply(parameters: Path577, responses: `401Content48403Content48404Content48`): Responses401Content48403Content48404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401Content48403Content48404Content48]
  }
  
  extension [Self <: Responses401Content48403Content48404Content48](x: Self) {
    
    inline def setParameters(value: Path577): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content48403Content48404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
