package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters638 extends StObject {
  
  var parameters: `638`
  
  var responses: `297`
}
object Parameters638 {
  
  inline def apply(parameters: `638`, responses: `297`): Parameters638 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters638]
  }
  
  extension [Self <: Parameters638](x: Self) {
    
    inline def setParameters(value: `638`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `297`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
