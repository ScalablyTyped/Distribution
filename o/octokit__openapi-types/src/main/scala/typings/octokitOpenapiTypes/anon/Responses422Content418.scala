package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content418 extends StObject {
  
  var parameters: PathRunneridNumber
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `422Content418`
}
object Responses422Content418 {
  
  inline def apply(
    parameters: PathRunneridNumber,
    requestBody: ContentApplicationjsonLabels,
    responses: `422Content418`
  ): Responses422Content418 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content418]
  }
  
  extension [Self <: Responses422Content418](x: Self) {
    
    inline def setParameters(value: PathRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content418`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
