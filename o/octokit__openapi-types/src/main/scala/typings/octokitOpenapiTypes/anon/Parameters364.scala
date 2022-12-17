package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters364 extends StObject {
  
  var parameters: `364`
  
  var responses: `200Content44304`
}
object Parameters364 {
  
  inline def apply(parameters: `364`, responses: `200Content44304`): Parameters364 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters364]
  }
  
  extension [Self <: Parameters364](x: Self) {
    
    inline def setParameters(value: `364`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content44304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
