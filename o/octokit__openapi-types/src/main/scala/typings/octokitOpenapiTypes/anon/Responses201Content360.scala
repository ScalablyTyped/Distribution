package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content360 extends StObject {
  
  var requestBody: ContentApplicationjson217
  
  var responses: `201Content360`
}
object Responses201Content360 {
  
  inline def apply(requestBody: ContentApplicationjson217, responses: `201Content360`): Responses201Content360 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content360]
  }
  
  extension [Self <: Responses201Content360](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjson217): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content360`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
