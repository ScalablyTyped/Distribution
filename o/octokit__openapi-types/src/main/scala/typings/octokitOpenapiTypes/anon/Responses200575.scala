package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200575 extends StObject {
  
  var parameters: `395`
  
  var responses: `200575`
}
object Responses200575 {
  
  inline def apply(parameters: `395`, responses: `200575`): Responses200575 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200575]
  }
  
  extension [Self <: Responses200575](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200575`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
