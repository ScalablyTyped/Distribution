package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent252 extends StObject {
  
  var parameters: Path246
  
  var requestBody: Content252
}
object RequestBodyContent252 {
  
  inline def apply(parameters: Path246, requestBody: Content252): RequestBodyContent252 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent252]
  }
  
  extension [Self <: RequestBodyContent252](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content252): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
