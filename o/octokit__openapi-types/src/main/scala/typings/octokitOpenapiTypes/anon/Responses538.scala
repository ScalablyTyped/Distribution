package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses538 extends StObject {
  
  var parameters: PathRepoString
  
  var requestBody: ContentApplicationjsonDescriptionNewname
  
  var responses: `538`
}
object Responses538 {
  
  inline def apply(
    parameters: PathRepoString,
    requestBody: ContentApplicationjsonDescriptionNewname,
    responses: `538`
  ): Responses538 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses538]
  }
  
  extension [Self <: Responses538](x: Self) {
    
    inline def setParameters(value: PathRepoString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `538`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
