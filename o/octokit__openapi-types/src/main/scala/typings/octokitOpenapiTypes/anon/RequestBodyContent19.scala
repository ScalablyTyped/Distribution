package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent19 extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: Content19
}
object RequestBodyContent19 {
  
  inline def apply(parameters: PathEnterprise, requestBody: Content19): RequestBodyContent19 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent19]
  }
  
  extension [Self <: RequestBodyContent19](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content19): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
