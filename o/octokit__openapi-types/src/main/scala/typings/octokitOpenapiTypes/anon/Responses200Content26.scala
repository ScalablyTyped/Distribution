package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content26 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200Content26`
}
object Responses200Content26 {
  
  inline def apply(parameters: QueryPage, responses: `200Content26`): Responses200Content26 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content26]
  }
  
  extension [Self <: Responses200Content26](x: Self) {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content26`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
