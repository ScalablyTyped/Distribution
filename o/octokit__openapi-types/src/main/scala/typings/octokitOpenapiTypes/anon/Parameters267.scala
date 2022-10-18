package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters267 extends StObject {
  
  var parameters: `267`
  
  var responses: `403503`
}
object Parameters267 {
  
  inline def apply(parameters: `267`, responses: `403503`): Parameters267 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters267]
  }
  
  extension [Self <: Parameters267](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
