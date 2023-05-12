package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395 extends StObject {
  
  var parameters: `395`
  
  var responses: `44`
}
object Parameters395 {
  
  inline def apply(parameters: `395`, responses: `44`): Parameters395 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters395] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `44`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
