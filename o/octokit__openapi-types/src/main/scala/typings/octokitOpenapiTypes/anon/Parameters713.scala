package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters713 extends StObject {
  
  var parameters: `713`
  
  var responses: `200Content714`
}
object Parameters713 {
  
  inline def apply(parameters: `713`, responses: `200Content714`): Parameters713 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters713]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters713] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `713`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content714`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
