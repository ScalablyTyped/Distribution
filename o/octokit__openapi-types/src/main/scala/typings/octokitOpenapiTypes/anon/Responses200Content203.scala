package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content203 extends StObject {
  
  var parameters: `17`
  
  var responses: `200Content203`
}
object Responses200Content203 {
  
  inline def apply(parameters: `17`, responses: `200Content203`): Responses200Content203 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content203]
  }
  
  extension [Self <: Responses200Content203](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content203`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
