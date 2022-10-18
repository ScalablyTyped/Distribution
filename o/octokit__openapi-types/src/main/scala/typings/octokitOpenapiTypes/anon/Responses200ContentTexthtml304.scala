package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentTexthtml304 extends StObject {
  
  var requestBody: ContentApplicationjsonContextMode
  
  var responses: `200ContentTexthtml304`
}
object Responses200ContentTexthtml304 {
  
  inline def apply(requestBody: ContentApplicationjsonContextMode, responses: `200ContentTexthtml304`): Responses200ContentTexthtml304 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentTexthtml304]
  }
  
  extension [Self <: Responses200ContentTexthtml304](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonContextMode): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtml304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
