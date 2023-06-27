package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395Responses127 extends StObject {
  
  var parameters: `395`
  
  var responses: `127`
}
object Parameters395Responses127 {
  
  inline def apply(parameters: `395`, responses: `127`): Parameters395Responses127 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395Responses127]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters395Responses127] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `127`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
