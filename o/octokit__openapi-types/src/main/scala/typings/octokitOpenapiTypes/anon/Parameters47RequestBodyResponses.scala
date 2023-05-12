package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters47RequestBodyResponses extends StObject {
  
  var parameters: `47`
  
  var requestBody: js.UndefOr[Content59] = js.undefined
}
object Parameters47RequestBodyResponses {
  
  inline def apply(parameters: `47`): Parameters47RequestBodyResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters47RequestBodyResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters47RequestBodyResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content59): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
