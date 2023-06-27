package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCreatedatEnabled extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonPattern
  
  var responses: `201ContentApplicationjsonCreatedatEnabled`
}
object Responses201ContentApplicationjsonCreatedatEnabled {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonPattern,
    responses: `201ContentApplicationjsonCreatedatEnabled`
  ): Responses201ContentApplicationjsonCreatedatEnabled = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCreatedatEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonCreatedatEnabled] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPattern): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedatEnabled`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
