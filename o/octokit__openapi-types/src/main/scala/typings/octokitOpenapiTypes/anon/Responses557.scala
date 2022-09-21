package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses557 extends StObject {
  
  var parameters: PathRepoString
  
  var requestBody: ContentApplicationjsonDescriptionNewname
  
  var responses: `557`
}
object Responses557 {
  
  inline def apply(
    parameters: PathRepoString,
    requestBody: ContentApplicationjsonDescriptionNewname,
    responses: `557`
  ): Responses557 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses557]
  }
  
  extension [Self <: Responses557](x: Self) {
    
    inline def setParameters(value: PathRepoString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `557`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
