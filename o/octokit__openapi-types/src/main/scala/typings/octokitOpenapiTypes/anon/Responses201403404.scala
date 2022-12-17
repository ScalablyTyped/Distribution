package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201403404 extends StObject {
  
  var parameters: `147`
  
  var responses: `201403404`
}
object Responses201403404 {
  
  inline def apply(parameters: `147`, responses: `201403404`): Responses201403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201403404]
  }
  
  extension [Self <: Responses201403404](x: Self) {
    
    inline def setParameters(value: `147`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
