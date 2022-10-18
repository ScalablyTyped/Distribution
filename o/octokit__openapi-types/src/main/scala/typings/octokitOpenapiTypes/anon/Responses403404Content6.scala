package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404Content6 extends StObject {
  
  var parameters: `395`
  
  var responses: `403404Content6`
}
object Responses403404Content6 {
  
  inline def apply(parameters: `395`, responses: `403404Content6`): Responses403404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404Content6]
  }
  
  extension [Self <: Responses403404Content6](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
