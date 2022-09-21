package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content295 extends StObject {
  
  var parameters: `144`
  
  var responses: `201Content295`
}
object Responses201Content295 {
  
  inline def apply(parameters: `144`, responses: `201Content295`): Responses201Content295 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content295]
  }
  
  extension [Self <: Responses201Content295](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content295`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
