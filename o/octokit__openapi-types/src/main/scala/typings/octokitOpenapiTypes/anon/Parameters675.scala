package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters675 extends StObject {
  
  var parameters: `675`
  
  var responses: `200Content676`
}
object Parameters675 {
  
  inline def apply(parameters: `675`, responses: `200Content676`): Parameters675 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters675]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters675] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `675`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content676`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
