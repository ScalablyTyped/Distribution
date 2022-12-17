package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent18 extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: Content18
}
object RequestBodyContent18 {
  
  inline def apply(parameters: PathEnterprise, requestBody: Content18): RequestBodyContent18 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent18]
  }
  
  extension [Self <: RequestBodyContent18](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content18): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
