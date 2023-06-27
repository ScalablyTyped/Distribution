package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters737 extends StObject {
  
  var parameters: `737`
  
  var responses: `200401403404410`
}
object Parameters737 {
  
  inline def apply(parameters: `737`, responses: `200401403404410`): Parameters737 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters737]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters737] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `737`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
