package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters37RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object Parameters37RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonSelectedrepositoryids): Parameters37RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters37RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: Parameters37RequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
