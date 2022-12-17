package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content106 extends StObject {
  
  var parameters: `57`
  
  var responses: `200Content106`
}
object Responses200Content106 {
  
  inline def apply(parameters: `57`, responses: `200Content106`): Responses200Content106 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content106]
  }
  
  extension [Self <: Responses200Content106](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content106`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
