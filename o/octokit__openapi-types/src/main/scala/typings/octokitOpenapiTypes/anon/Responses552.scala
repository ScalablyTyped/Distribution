package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses552 extends StObject {
  
  var parameters: `395`
  
  var responses: `552`
}
object Responses552 {
  
  inline def apply(parameters: `395`, responses: `552`): Responses552 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses552]
  }
  
  extension [Self <: Responses552](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `552`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
