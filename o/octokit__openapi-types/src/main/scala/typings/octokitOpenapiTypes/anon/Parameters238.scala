package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters238 extends StObject {
  
  var parameters: `238`
  
  var responses: `200Content239`
}
object Parameters238 {
  
  inline def apply(parameters: `238`, responses: `200Content239`): Parameters238 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters238]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters238] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `238`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content239`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
