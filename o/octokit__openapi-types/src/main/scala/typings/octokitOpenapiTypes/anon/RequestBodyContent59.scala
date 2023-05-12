package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent59 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content59
}
object RequestBodyContent59 {
  
  inline def apply(parameters: `141`, requestBody: Content59): RequestBodyContent59 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent59]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent59] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content59): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
