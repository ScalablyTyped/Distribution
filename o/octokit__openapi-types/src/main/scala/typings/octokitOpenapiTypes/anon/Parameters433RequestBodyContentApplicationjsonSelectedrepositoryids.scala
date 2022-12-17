package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters433RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object Parameters433RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: `433`, requestBody: ContentApplicationjsonSelectedrepositoryids): Parameters433RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters433RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: Parameters433RequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
