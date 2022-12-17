package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonConfigurationfilepath extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonConfigurationfilepath
  
  var responses: `200Content317`
}
object RequestBodyContentApplicationjsonConfigurationfilepath {
  
  inline def apply(
    parameters: `135`,
    requestBody: ContentApplicationjsonConfigurationfilepath,
    responses: `200Content317`
  ): RequestBodyContentApplicationjsonConfigurationfilepath = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonConfigurationfilepath]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonConfigurationfilepath](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigurationfilepath): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content317`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
