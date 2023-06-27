package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters673 extends StObject {
  
  var parameters: `673`
  
  var responses: `200ContentApplicationjsonMachinesTotalcount`
}
object Parameters673 {
  
  inline def apply(parameters: `673`, responses: `200ContentApplicationjsonMachinesTotalcount`): Parameters673 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters673]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters673] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `673`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMachinesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
