package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathNameStringOrgString
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathNameStringOrgString, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
