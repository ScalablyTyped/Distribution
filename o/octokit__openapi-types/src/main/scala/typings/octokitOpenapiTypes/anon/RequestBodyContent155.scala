package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent155 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content155
}
object RequestBodyContent155 {
  
  inline def apply(parameters: `144`, requestBody: Content155): RequestBodyContent155 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent155]
  }
  
  extension [Self <: RequestBodyContent155](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content155): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
