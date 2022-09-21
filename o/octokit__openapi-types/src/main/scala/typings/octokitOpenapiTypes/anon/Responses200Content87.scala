package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content87 extends StObject {
  
  var requestBody: Content88
  
  var responses: `200Content87`
}
object Responses200Content87 {
  
  inline def apply(requestBody: Content88, responses: `200Content87`): Responses200Content87 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content87]
  }
  
  extension [Self <: Responses200Content87](x: Self) {
    
    inline def setRequestBody(value: Content88): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content87`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
