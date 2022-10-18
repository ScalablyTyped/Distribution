package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content337 extends StObject {
  
  var requestBody: Content338
  
  var responses: `200Content337`
}
object Responses200Content337 {
  
  inline def apply(requestBody: Content338, responses: `200Content337`): Responses200Content337 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content337]
  }
  
  extension [Self <: Responses200Content337](x: Self) {
    
    inline def setRequestBody(value: Content338): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content337`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
