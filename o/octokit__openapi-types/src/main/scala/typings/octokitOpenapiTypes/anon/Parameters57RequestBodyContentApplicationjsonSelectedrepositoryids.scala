package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters57RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object Parameters57RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjsonSelectedrepositoryids): Parameters57RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters57RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: Parameters57RequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
