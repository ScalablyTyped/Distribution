package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content255 extends StObject {
  
  var parameters: Path246
  
  var requestBody: ContentApplicationjsonRestrictedtoworkflows
  
  var responses: `201Content255`
}
object Responses201Content255 {
  
  inline def apply(
    parameters: Path246,
    requestBody: ContentApplicationjsonRestrictedtoworkflows,
    responses: `201Content255`
  ): Responses201Content255 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content255]
  }
  
  extension [Self <: Responses201Content255](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRestrictedtoworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content255`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
