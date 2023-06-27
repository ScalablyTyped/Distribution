package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters35 extends StObject {
  
  var parameters: `35`
  
  var responses: `200304404`
}
object Parameters35 {
  
  inline def apply(parameters: `35`, responses: `200304404`): Parameters35 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters35]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters35] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `35`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
