package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters678 extends StObject {
  
  var parameters: `678`
  
  var responses: `409500`
}
object Parameters678 {
  
  inline def apply(parameters: `678`, responses: `409500`): Parameters678 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters678]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters678] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `678`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
