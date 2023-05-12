package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery522 extends StObject {
  
  var parameters: Query522
  
  var responses: `200Content523`
}
object ParametersQuery522 {
  
  inline def apply(parameters: Query522, responses: `200Content523`): ParametersQuery522 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery522]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery522] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query522): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content523`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
