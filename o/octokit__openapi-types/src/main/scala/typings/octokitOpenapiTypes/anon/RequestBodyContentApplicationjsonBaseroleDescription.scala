package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBaseroleDescription extends StObject {
  
  var parameters: PathRoleid
  
  var requestBody: ContentApplicationjsonBaseroleDescription
  
  var responses: `200Content70`
}
object RequestBodyContentApplicationjsonBaseroleDescription {
  
  inline def apply(
    parameters: PathRoleid,
    requestBody: ContentApplicationjsonBaseroleDescription,
    responses: `200Content70`
  ): RequestBodyContentApplicationjsonBaseroleDescription = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBaseroleDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBaseroleDescription] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRoleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseroleDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content70`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
