package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content554 extends StObject {
  
  var parameters: `395`
  
  var responses: `201Content554`
}
object Responses201Content554 {
  
  inline def apply(parameters: `395`, responses: `201Content554`): Responses201Content554 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content554]
  }
  
  extension [Self <: Responses201Content554](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content554`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
