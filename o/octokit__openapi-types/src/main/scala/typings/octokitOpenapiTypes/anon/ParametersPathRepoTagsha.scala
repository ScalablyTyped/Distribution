package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTagsha extends StObject {
  
  var parameters: PathRepoTagsha
  
  var responses: `200510`
}
object ParametersPathRepoTagsha {
  
  inline def apply(parameters: PathRepoTagsha, responses: `200510`): ParametersPathRepoTagsha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTagsha]
  }
  
  extension [Self <: ParametersPathRepoTagsha](x: Self) {
    
    inline def setParameters(value: PathRepoTagsha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200510`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
