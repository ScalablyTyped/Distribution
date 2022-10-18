package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent254 extends StObject {
  
  var parameters: Path246
  
  var requestBody: Content254
}
object RequestBodyContent254 {
  
  inline def apply(parameters: Path246, requestBody: Content254): RequestBodyContent254 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent254]
  }
  
  extension [Self <: RequestBodyContent254](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content254): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
