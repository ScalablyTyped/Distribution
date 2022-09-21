package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content27 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200Content27`
}
object Responses200Content27 {
  
  inline def apply(parameters: QueryPage, responses: `200Content27`): Responses200Content27 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content27]
  }
  
  extension [Self <: Responses200Content27](x: Self) {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content27`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
