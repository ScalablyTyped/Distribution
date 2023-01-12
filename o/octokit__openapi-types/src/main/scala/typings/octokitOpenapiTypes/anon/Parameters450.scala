package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters450 extends StObject {
  
  var parameters: `450`
  
  var responses: `404Content48`
}
object Parameters450 {
  
  inline def apply(parameters: `450`, responses: `404Content48`): Parameters450 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters450]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters450] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `450`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
