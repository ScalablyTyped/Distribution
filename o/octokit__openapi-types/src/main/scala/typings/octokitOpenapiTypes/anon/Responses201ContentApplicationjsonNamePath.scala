package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonNamePath extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonScope
  
  var responses: `201ContentApplicationjsonNamePath`
}
object Responses201ContentApplicationjsonNamePath {
  
  inline def apply(
    parameters: `582`,
    requestBody: ContentApplicationjsonScope,
    responses: `201ContentApplicationjsonNamePath`
  ): Responses201ContentApplicationjsonNamePath = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonNamePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonNamePath] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonScope): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNamePath`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
