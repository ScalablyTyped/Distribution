package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters602 extends StObject {
  
  var parameters: `602`
  
  var responses: `200Content597`
}
object Parameters602 {
  
  inline def apply(parameters: `602`, responses: `200Content597`): Parameters602 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters602]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters602] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `602`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content597`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
