package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters569 extends StObject {
  
  var parameters: `569`
  
  var responses: `200304404422`
}
object Parameters569 {
  
  inline def apply(parameters: `569`, responses: `200304404422`): Parameters569 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters569]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters569] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `569`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
