package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters688 extends StObject {
  
  var parameters: `688`
  
  var responses: `200304400403`
}
object Parameters688 {
  
  inline def apply(parameters: `688`, responses: `200304400403`): Parameters688 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters688]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters688] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `688`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
