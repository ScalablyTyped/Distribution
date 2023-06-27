package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters337 extends StObject {
  
  var parameters: `337`
  
  var responses: `200Content138404410`
}
object Parameters337 {
  
  inline def apply(parameters: `337`, responses: `200Content138404410`): Parameters337 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters337]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters337] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `337`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content138404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
