package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395RequestBodyContent252 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content252
}
object Parameters395RequestBodyContent252 {
  
  inline def apply(parameters: `395`, requestBody: Content252): Parameters395RequestBodyContent252 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395RequestBodyContent252]
  }
  
  extension [Self <: Parameters395RequestBodyContent252](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content252): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
