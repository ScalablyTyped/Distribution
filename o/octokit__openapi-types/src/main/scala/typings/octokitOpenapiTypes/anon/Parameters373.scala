package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters373 extends StObject {
  
  var parameters: `373`
  
  var responses: `200Content252`
}
object Parameters373 {
  
  inline def apply(parameters: `373`, responses: `200Content252`): Parameters373 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters373]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters373] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `373`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content252`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
