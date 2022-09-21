package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content607 extends StObject {
  
  var parameters: `434`
  
  var responses: `200Content607`
}
object Responses200Content607 {
  
  inline def apply(parameters: `434`, responses: `200Content607`): Responses200Content607 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content607]
  }
  
  extension [Self <: Responses200Content607](x: Self) {
    
    inline def setParameters(value: `434`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content607`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
