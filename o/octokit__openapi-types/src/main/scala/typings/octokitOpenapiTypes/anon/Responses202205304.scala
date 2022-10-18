package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202205304 extends StObject {
  
  var requestBody: ContentApplicationjsonLastreadatRead
  
  var responses: `202205304`
}
object Responses202205304 {
  
  inline def apply(requestBody: ContentApplicationjsonLastreadatRead, responses: `202205304`): Responses202205304 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202205304]
  }
  
  extension [Self <: Responses202205304](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonLastreadatRead): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202205304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
