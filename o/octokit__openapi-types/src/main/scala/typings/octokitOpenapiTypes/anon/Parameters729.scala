package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters729 extends StObject {
  
  var parameters: `729`
  
  var responses: `200Content730`
}
object Parameters729 {
  
  inline def apply(parameters: `729`, responses: `200Content730`): Parameters729 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters729]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters729] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `729`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content730`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
