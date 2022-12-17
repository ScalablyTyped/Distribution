package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content395 extends StObject {
  
  var parameters: PathRunneridNumber
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `422Content395`
}
object Responses422Content395 {
  
  inline def apply(
    parameters: PathRunneridNumber,
    requestBody: ContentApplicationjsonLabels,
    responses: `422Content395`
  ): Responses422Content395 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content395]
  }
  
  extension [Self <: Responses422Content395](x: Self) {
    
    inline def setParameters(value: PathRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
