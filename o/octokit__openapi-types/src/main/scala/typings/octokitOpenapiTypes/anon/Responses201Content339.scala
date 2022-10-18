package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content339 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonInviteeid
  
  var responses: `201Content339`
}
object Responses201Content339 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonInviteeid, responses: `201Content339`): Responses201Content339 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content339]
  }
  
  extension [Self <: Responses201Content339](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonInviteeid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content339`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
