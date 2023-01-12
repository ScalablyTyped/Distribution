package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAssetsurl extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonDiscussioncategoryname
  
  var responses: `201ContentApplicationjsonAssetsurl`
}
object Responses201ContentApplicationjsonAssetsurl {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonDiscussioncategoryname,
    responses: `201ContentApplicationjsonAssetsurl`
  ): Responses201ContentApplicationjsonAssetsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAssetsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonAssetsurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAssetsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
