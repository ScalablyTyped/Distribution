package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters208 extends StObject {
  
  var parameters: `208`
  
  var responses: `200Content29304Unknown`
}
object Parameters208 {
  
  inline def apply(parameters: `208`, responses: `200Content29304Unknown`): Parameters208 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters208]
  }
  
  extension [Self <: Parameters208](x: Self) {
    
    inline def setParameters(value: `208`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content29304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
