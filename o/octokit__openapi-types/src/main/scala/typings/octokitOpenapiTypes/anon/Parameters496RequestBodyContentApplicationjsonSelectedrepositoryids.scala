package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters496RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object Parameters496RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: `496`, requestBody: ContentApplicationjsonSelectedrepositoryids): Parameters496RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters496RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters496RequestBodyContentApplicationjsonSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
