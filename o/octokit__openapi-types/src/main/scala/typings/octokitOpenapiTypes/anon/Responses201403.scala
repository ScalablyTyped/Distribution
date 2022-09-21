package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201403 extends StObject {
  
  var parameters: `157`
  
  var responses: `201403`
}
object Responses201403 {
  
  inline def apply(parameters: `157`, responses: `201403`): Responses201403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201403]
  }
  
  extension [Self <: Responses201403](x: Self) {
    
    inline def setParameters(value: `157`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
