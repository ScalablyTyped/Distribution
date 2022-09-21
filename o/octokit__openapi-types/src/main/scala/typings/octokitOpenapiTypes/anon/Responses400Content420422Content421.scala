package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400Content420422Content421 extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonBuildtype
  
  var responses: `400Content420422Content421`
}
object Responses400Content420422Content421 {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonBuildtype,
    responses: `400Content420422Content421`
  ): Responses400Content420422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400Content420422Content421]
  }
  
  extension [Self <: Responses400Content420422Content421](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBuildtype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400Content420422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
