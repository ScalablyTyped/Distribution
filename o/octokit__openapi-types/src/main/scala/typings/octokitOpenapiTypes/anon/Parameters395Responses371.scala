package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395Responses371 extends StObject {
  
  var parameters: `395`
  
  var responses: `371`
}
object Parameters395Responses371 {
  
  inline def apply(parameters: `395`, responses: `371`): Parameters395Responses371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395Responses371]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters395Responses371] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `371`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
