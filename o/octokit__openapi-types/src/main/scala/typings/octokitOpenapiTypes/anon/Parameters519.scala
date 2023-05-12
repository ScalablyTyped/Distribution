package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters519 extends StObject {
  
  var parameters: `519`
  
  var responses: `404Content36`
}
object Parameters519 {
  
  inline def apply(parameters: `519`, responses: `404Content36`): Parameters519 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters519]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters519] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `519`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
