package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200202204 extends StObject {
  
  var parameters: `135`
  
  var responses: `200202204`
}
object Responses200202204 {
  
  inline def apply(parameters: `135`, responses: `200202204`): Responses200202204 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200202204]
  }
  
  extension [Self <: Responses200202204](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
