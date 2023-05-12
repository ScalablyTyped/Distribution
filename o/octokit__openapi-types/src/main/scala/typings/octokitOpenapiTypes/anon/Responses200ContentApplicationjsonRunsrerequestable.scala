package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRunsrerequestable extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonHeadsha
  
  var responses: `200ContentApplicationjsonRunsrerequestable`
}
object Responses200ContentApplicationjsonRunsrerequestable {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonHeadsha,
    responses: `200ContentApplicationjsonRunsrerequestable`
  ): Responses200ContentApplicationjsonRunsrerequestable = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRunsrerequestable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRunsrerequestable] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHeadsha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunsrerequestable`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
