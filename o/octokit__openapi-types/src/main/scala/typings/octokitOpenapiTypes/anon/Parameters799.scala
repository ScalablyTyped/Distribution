package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters799 extends StObject {
  
  var parameters: `799`
  
  var responses: `200Content800`
}
object Parameters799 {
  
  inline def apply(parameters: `799`, responses: `200Content800`): Parameters799 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters799]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters799] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `799`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content800`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
