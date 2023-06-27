package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters51 extends StObject {
  
  var parameters: `51`
  
  var responses: `200ContentApplicationoctocatstream`
}
object Parameters51 {
  
  inline def apply(parameters: `51`, responses: `200ContentApplicationoctocatstream`): Parameters51 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters51]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters51] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `51`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationoctocatstream`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
