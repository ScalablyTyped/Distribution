package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters640 extends StObject {
  
  var parameters: `640`
  
  var responses: `200ContentApplicationjsonActionscaches`
}
object Parameters640 {
  
  inline def apply(parameters: `640`, responses: `200ContentApplicationjsonActionscaches`): Parameters640 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters640]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters640] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `640`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonActionscaches`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
