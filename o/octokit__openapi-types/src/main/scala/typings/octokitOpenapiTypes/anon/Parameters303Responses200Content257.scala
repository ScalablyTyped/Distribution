package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters303Responses200Content257 extends StObject {
  
  var parameters: `303`
  
  var responses: `200Content257`
}
object Parameters303Responses200Content257 {
  
  inline def apply(parameters: `303`, responses: `200Content257`): Parameters303Responses200Content257 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters303Responses200Content257]
  }
  
  extension [Self <: Parameters303Responses200Content257](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content257`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
