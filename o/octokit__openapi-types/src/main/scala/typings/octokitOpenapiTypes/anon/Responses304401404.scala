package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401404 extends StObject {
  
  var parameters: `17`
  
  var responses: `304401404`
}
object Responses304401404 {
  
  inline def apply(parameters: `17`, responses: `304401404`): Responses304401404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401404]
  }
  
  extension [Self <: Responses304401404](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
