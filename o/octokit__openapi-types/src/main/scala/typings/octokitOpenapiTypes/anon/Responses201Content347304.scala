package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content347304 extends StObject {
  
  var requestBody: ContentApplicationjsonExcludemetadata
  
  var responses: `201Content347304`
}
object Responses201Content347304 {
  
  inline def apply(requestBody: ContentApplicationjsonExcludemetadata, responses: `201Content347304`): Responses201Content347304 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content347304]
  }
  
  extension [Self <: Responses201Content347304](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonExcludemetadata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content347304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
