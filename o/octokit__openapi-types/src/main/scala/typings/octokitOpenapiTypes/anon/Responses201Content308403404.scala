package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content308403404 extends StObject {
  
  var parameters: `418`
  
  var responses: `201Content308403404`
}
object Responses201Content308403404 {
  
  inline def apply(parameters: `418`, responses: `201Content308403404`): Responses201Content308403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content308403404]
  }
  
  extension [Self <: Responses201Content308403404](x: Self) {
    
    inline def setParameters(value: `418`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content308403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
