package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoString extends StObject {
  
  var parameters: PathRepoString
  
  var responses: `200556`
}
object ParametersPathRepoString {
  
  inline def apply(parameters: PathRepoString, responses: `200556`): ParametersPathRepoString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoString]
  }
  
  extension [Self <: ParametersPathRepoString](x: Self) {
    
    inline def setParameters(value: PathRepoString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200556`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
