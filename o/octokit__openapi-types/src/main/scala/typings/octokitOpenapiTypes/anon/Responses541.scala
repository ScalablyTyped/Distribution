package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses541 extends StObject {
  
  var parameters: PathNameStringOwner
  
  var requestBody: ContentApplicationjsonDescriptionNewname
  
  var responses: `541`
}
object Responses541 {
  
  inline def apply(
    parameters: PathNameStringOwner,
    requestBody: ContentApplicationjsonDescriptionNewname,
    responses: `541`
  ): Responses541 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses541]
  }
  
  extension [Self <: Responses541](x: Self) {
    
    inline def setParameters(value: PathNameStringOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `541`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
