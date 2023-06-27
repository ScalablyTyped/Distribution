package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters611 extends StObject {
  
  var parameters: `611`
  
  var responses: `612`
}
object Parameters611 {
  
  inline def apply(parameters: `611`, responses: `612`): Parameters611 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters611]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters611] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `611`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `612`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
