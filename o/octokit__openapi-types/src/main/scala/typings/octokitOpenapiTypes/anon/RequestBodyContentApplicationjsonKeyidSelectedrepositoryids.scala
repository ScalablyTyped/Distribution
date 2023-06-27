package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: Path450
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201404422`
}
object RequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: Path450,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201404422`
  ): RequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonKeyidSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path450): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
