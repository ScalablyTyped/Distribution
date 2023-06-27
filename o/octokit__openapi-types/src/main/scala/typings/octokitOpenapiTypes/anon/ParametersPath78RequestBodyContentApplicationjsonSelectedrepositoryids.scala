package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: Path78
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: Path78, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path78): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
