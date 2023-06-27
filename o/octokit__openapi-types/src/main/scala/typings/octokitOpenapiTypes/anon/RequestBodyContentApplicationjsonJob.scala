package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonJob extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonJob
  
  var responses: `201ContentApplicationjsonCreatedat`
}
object RequestBodyContentApplicationjsonJob {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonJob,
    responses: `201ContentApplicationjsonCreatedat`
  ): RequestBodyContentApplicationjsonJob = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonJob] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonJob): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
