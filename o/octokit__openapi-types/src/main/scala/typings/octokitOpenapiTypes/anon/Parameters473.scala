package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters473 extends StObject {
  
  var parameters: `473`
  
  var responses: `200304401403422`
}
object Parameters473 {
  
  inline def apply(parameters: `473`, responses: `200304401403422`): Parameters473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `473`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
