package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses204 extends StObject {
  
  var parameters: `76`
  
  var responses: `204`
}
object Responses204 {
  
  inline def apply(parameters: `76`, responses: `204`): Responses204 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses204]
  }
  
  extension [Self <: Responses204](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
