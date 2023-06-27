package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters755 extends StObject {
  
  var parameters: `755`
  
  var responses: `200Content756`
}
object Parameters755 {
  
  inline def apply(parameters: `755`, responses: `200Content756`): Parameters755 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters755]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters755] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `755`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content756`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
