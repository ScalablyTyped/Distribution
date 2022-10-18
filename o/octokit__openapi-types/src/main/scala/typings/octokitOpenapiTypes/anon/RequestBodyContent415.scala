package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent415 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content415
}
object RequestBodyContent415 {
  
  inline def apply(parameters: `395`, requestBody: Content415): RequestBodyContent415 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent415]
  }
  
  extension [Self <: RequestBodyContent415](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content415): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
