package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters176 extends StObject {
  
  var parameters: `176`
  
  var responses: `200ContentApplicationjsonTotalcountVariables`
}
object Parameters176 {
  
  inline def apply(parameters: `176`, responses: `200ContentApplicationjsonTotalcountVariables`): Parameters176 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters176]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters176] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `176`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountVariables`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
