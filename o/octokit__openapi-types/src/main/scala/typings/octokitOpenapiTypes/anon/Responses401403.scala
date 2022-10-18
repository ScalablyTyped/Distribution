package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403 extends StObject {
  
  var parameters: `17`
  
  var responses: `401403`
}
object Responses401403 {
  
  inline def apply(parameters: `17`, responses: `401403`): Responses401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403]
  }
  
  extension [Self <: Responses401403](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
