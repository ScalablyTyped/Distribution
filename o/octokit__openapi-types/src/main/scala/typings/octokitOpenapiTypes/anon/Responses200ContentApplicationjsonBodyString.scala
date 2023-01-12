package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodyString extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonConfigurationfilepath
  
  var responses: `200ContentApplicationjsonBodyString`
}
object Responses200ContentApplicationjsonBodyString {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonConfigurationfilepath,
    responses: `200ContentApplicationjsonBodyString`
  ): Responses200ContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodyString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBodyString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigurationfilepath): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
