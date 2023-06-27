package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonConfigurationfilepath extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonConfigurationfilepath
  
  var responses: `200Content387`
}
object RequestBodyContentApplicationjsonConfigurationfilepath {
  
  inline def apply(
    parameters: `165`,
    requestBody: ContentApplicationjsonConfigurationfilepath,
    responses: `200Content387`
  ): RequestBodyContentApplicationjsonConfigurationfilepath = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonConfigurationfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonConfigurationfilepath] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigurationfilepath): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content387`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
