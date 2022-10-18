package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content86 extends StObject {
  
  var parameters: `80`
  
  var responses: `200Content86`
}
object Responses200Content86 {
  
  inline def apply(parameters: `80`, responses: `200Content86`): Responses200Content86 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content86]
  }
  
  extension [Self <: Responses200Content86](x: Self) {
    
    inline def setParameters(value: `80`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content86`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
