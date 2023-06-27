package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters20 extends StObject {
  
  var parameters: `20`
  
  var responses: `200304403`
}
object Parameters20 {
  
  inline def apply(parameters: `20`, responses: `200304403`): Parameters20 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters20]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters20] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `20`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
