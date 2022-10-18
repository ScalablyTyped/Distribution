package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200202400 extends StObject {
  
  var parameters: `395`
  
  var responses: `200202400`
}
object Responses200202400 {
  
  inline def apply(parameters: `395`, responses: `200202400`): Responses200202400 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200202400]
  }
  
  extension [Self <: Responses200202400](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
