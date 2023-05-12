package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonMessageNodeid extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonObject
  
  var responses: `201ContentApplicationjsonMessageNodeid`
}
object Responses201ContentApplicationjsonMessageNodeid {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonObject,
    responses: `201ContentApplicationjsonMessageNodeid`
  ): Responses201ContentApplicationjsonMessageNodeid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonMessageNodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonMessageNodeid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonMessageNodeid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
