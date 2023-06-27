package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters582RequestBodyResponses extends StObject {
  
  var parameters: `582`
  
  var requestBody: js.UndefOr[ContentApplicationjson587] = js.undefined
}
object Parameters582RequestBodyResponses {
  
  inline def apply(parameters: `582`): Parameters582RequestBodyResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters582RequestBodyResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters582RequestBodyResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson587): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
