package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters582RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object Parameters582RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: `582`, requestBody: ContentApplicationjsonSelectedrepositoryids): Parameters582RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters582RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters582RequestBodyContentApplicationjsonSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
