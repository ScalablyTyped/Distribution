package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonScope extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonScope
  
  var responses: `201422`
}
object RequestBodyContentApplicationjsonScope {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjsonScope, responses: `201422`): RequestBodyContentApplicationjsonScope = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonScope] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonScope): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
