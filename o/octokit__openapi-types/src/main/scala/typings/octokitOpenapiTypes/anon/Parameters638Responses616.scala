package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters638Responses616 extends StObject {
  
  var parameters: `638`
  
  var responses: `616`
}
object Parameters638Responses616 {
  
  inline def apply(parameters: `638`, responses: `616`): Parameters638Responses616 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters638Responses616]
  }
  
  extension [Self <: Parameters638Responses616](x: Self) {
    
    inline def setParameters(value: `638`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `616`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
