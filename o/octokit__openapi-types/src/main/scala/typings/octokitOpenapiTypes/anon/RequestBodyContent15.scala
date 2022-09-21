package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent15 extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: Content15
}
object RequestBodyContent15 {
  
  inline def apply(parameters: PathEnterprise, requestBody: Content15): RequestBodyContent15 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent15]
  }
  
  extension [Self <: RequestBodyContent15](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content15): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
