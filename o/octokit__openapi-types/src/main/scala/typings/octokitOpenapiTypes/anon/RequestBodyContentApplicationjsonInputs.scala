package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonInputs extends StObject {
  
  var parameters: PathWorkflowid
  
  var requestBody: ContentApplicationjsonInputs
}
object RequestBodyContentApplicationjsonInputs {
  
  inline def apply(parameters: PathWorkflowid, requestBody: ContentApplicationjsonInputs): RequestBodyContentApplicationjsonInputs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonInputs]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonInputs](x: Self) {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonInputs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
