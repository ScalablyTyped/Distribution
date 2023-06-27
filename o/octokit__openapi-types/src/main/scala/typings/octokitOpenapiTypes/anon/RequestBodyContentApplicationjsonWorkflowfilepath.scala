package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonWorkflowfilepath extends StObject {
  
  var parameters: PathRequiredworkflowid
  
  var requestBody: ContentApplicationjsonWorkflowfilepath
  
  var responses: `200Content68422`
}
object RequestBodyContentApplicationjsonWorkflowfilepath {
  
  inline def apply(
    parameters: PathRequiredworkflowid,
    requestBody: ContentApplicationjsonWorkflowfilepath,
    responses: `200Content68422`
  ): RequestBodyContentApplicationjsonWorkflowfilepath = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonWorkflowfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonWorkflowfilepath] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonWorkflowfilepath): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content68422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
