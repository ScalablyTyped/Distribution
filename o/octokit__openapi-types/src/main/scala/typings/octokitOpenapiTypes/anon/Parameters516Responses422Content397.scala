package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters516Responses422Content397 extends StObject {
  
  var parameters: `516`
  
  var responses: `422Content397`
}
object Parameters516Responses422Content397 {
  
  inline def apply(parameters: `516`, responses: `422Content397`): Parameters516Responses422Content397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters516Responses422Content397]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters516Responses422Content397] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `516`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
