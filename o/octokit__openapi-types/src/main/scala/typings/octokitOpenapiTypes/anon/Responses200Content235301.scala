package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content235301 extends StObject {
  
  var parameters: `395`
  
  var responses: `200Content235301`
}
object Responses200Content235301 {
  
  inline def apply(parameters: `395`, responses: `200Content235301`): Responses200Content235301 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content235301]
  }
  
  extension [Self <: Responses200Content235301](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content235301`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
