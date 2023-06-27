package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters142 extends StObject {
  
  var parameters: `142`
  
  var responses: `143`
}
object Parameters142 {
  
  inline def apply(parameters: `142`, responses: `143`): Parameters142 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters142]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters142] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `142`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `143`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
