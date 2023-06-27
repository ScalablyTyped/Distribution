package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters753 extends StObject {
  
  var parameters: `753`
  
  var responses: `200Content621`
}
object Parameters753 {
  
  inline def apply(parameters: `753`, responses: `200Content621`): Parameters753 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters753]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters753] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `753`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content621`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
