package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content412 extends StObject {
  
  var parameters: `395`
  
  var responses: `200Content412`
}
object Responses200Content412 {
  
  inline def apply(parameters: `395`, responses: `200Content412`): Responses200Content412 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content412]
  }
  
  extension [Self <: Responses200Content412](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content412`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
