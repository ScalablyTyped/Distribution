package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters127Responses422Content8 extends StObject {
  
  var parameters: `127`
  
  var responses: `422Content8`
}
object Parameters127Responses422Content8 {
  
  inline def apply(parameters: `127`, responses: `422Content8`): Parameters127Responses422Content8 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters127Responses422Content8]
  }
  
  extension [Self <: Parameters127Responses422Content8](x: Self) {
    
    inline def setParameters(value: `127`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
