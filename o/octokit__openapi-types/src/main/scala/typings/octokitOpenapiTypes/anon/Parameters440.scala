package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters440 extends StObject {
  
  var parameters: `440`
  
  var responses: `200HeadersLink404`
}
object Parameters440 {
  
  inline def apply(parameters: `440`, responses: `200HeadersLink404`): Parameters440 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters440]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters440] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `440`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200HeadersLink404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
