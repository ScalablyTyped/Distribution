package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters303RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object Parameters303RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonSelectedrepositoryids): Parameters303RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters303RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: Parameters303RequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
