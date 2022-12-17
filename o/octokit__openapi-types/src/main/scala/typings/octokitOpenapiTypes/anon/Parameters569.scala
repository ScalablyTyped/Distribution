package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters569 extends StObject {
  
  var parameters: `569`
  
  var responses: `200Content451HeadersLink`
}
object Parameters569 {
  
  inline def apply(parameters: `569`, responses: `200Content451HeadersLink`): Parameters569 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters569]
  }
  
  extension [Self <: Parameters569](x: Self) {
    
    inline def setParameters(value: `569`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content451HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
