package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonConfigEventsName extends StObject {
  
  var parameters: PathHookidOrg
  
  var requestBody: ContentApplicationjsonConfigEventsName
  
  var responses: `200334404`
}
object RequestBodyContentApplicationjsonConfigEventsName {
  
  inline def apply(
    parameters: PathHookidOrg,
    requestBody: ContentApplicationjsonConfigEventsName,
    responses: `200334404`
  ): RequestBodyContentApplicationjsonConfigEventsName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonConfigEventsName]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonConfigEventsName](x: Self) {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigEventsName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200334404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
