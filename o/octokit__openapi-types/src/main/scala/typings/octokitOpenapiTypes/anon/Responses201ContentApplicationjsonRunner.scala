package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonRunner extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `201ContentApplicationjsonRunner`
}
object Responses201ContentApplicationjsonRunner {
  
  inline def apply(
    parameters: `582`,
    requestBody: ContentApplicationjsonLabels,
    responses: `201ContentApplicationjsonRunner`
  ): Responses201ContentApplicationjsonRunner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonRunner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonRunner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRunner`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
