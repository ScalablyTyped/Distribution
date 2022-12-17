package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEnabledrepositories extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonEnabledrepositories
}
object RequestBodyContentApplicationjsonEnabledrepositories {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjsonEnabledrepositories): RequestBodyContentApplicationjsonEnabledrepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEnabledrepositories]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEnabledrepositories](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEnabledrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
