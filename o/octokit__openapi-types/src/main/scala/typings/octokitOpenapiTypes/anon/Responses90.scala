package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses90 extends StObject {
  
  var parameters: `144`
  
  var responses: `90`
}
object Responses90 {
  
  inline def apply(parameters: `144`, responses: `90`): Responses90 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses90]
  }
  
  extension [Self <: Responses90](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `90`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
