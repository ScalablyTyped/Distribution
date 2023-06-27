package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonVisibility extends StObject {
  
  var parameters: Path78
  
  var requestBody: ContentApplicationjsonVisibility
}
object RequestBodyContentApplicationjsonVisibility {
  
  inline def apply(parameters: Path78, requestBody: ContentApplicationjsonVisibility): RequestBodyContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonVisibility] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path78): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
