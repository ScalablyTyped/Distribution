package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAssetsurl extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonDiscussioncategoryname
  
  var responses: `201ContentApplicationjsonAssetsurl`
}
object Responses201ContentApplicationjsonAssetsurl {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonDiscussioncategoryname,
    responses: `201ContentApplicationjsonAssetsurl`
  ): Responses201ContentApplicationjsonAssetsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAssetsurl]
  }
  
  extension [Self <: Responses201ContentApplicationjsonAssetsurl](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAssetsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
