package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters303RequestBodyContent252 extends StObject {
  
  var parameters: `303`
  
  var requestBody: Content252
}
object Parameters303RequestBodyContent252 {
  
  inline def apply(parameters: `303`, requestBody: Content252): Parameters303RequestBodyContent252 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters303RequestBodyContent252]
  }
  
  extension [Self <: Parameters303RequestBodyContent252](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content252): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
