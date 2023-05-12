package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathRequiredworkflowid
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathRequiredworkflowid, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
