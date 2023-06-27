package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters111 extends StObject {
  
  var parameters: `111`
  
  var responses: `9`
}
object Parameters111 {
  
  inline def apply(parameters: `111`, responses: `9`): Parameters111 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters111]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters111] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `111`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
