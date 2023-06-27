package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters242 extends StObject {
  
  var parameters: `242`
  
  var responses: `200ContentApplicationjsonBillableowner`
}
object Parameters242 {
  
  inline def apply(parameters: `242`, responses: `200ContentApplicationjsonBillableowner`): Parameters242 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters242]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters242] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `242`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBillableowner`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
