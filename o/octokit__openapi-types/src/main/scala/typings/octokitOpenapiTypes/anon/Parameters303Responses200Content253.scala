package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters303Responses200Content253 extends StObject {
  
  var parameters: `303`
  
  var responses: `200Content253`
}
object Parameters303Responses200Content253 {
  
  inline def apply(parameters: `303`, responses: `200Content253`): Parameters303Responses200Content253 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters303Responses200Content253]
  }
  
  extension [Self <: Parameters303Responses200Content253](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content253`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
