package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters406 extends StObject {
  
  var parameters: `406`
  
  var responses: `200Content407`
}
object Parameters406 {
  
  inline def apply(parameters: `406`, responses: `200Content407`): Parameters406 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters406]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters406] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `406`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content407`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
