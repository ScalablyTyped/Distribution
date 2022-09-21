package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath602 extends StObject {
  
  var parameters: Path602
  
  var responses: `200ContentApplicationjsonNameSelectedrepositoriesurl`
}
object ParametersPath602 {
  
  inline def apply(parameters: Path602, responses: `200ContentApplicationjsonNameSelectedrepositoriesurl`): ParametersPath602 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath602]
  }
  
  extension [Self <: ParametersPath602](x: Self) {
    
    inline def setParameters(value: Path602): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameSelectedrepositoriesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
