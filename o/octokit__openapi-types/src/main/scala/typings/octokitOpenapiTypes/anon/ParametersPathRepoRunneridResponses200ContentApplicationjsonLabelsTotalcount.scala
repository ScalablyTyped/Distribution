package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsTotalcount extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var responses: `200ContentApplicationjsonLabelsTotalcount`
}
object ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsTotalcount {
  
  inline def apply(parameters: PathRepoRunnerid, responses: `200ContentApplicationjsonLabelsTotalcount`): ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsTotalcount]
  }
  
  extension [Self <: ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsTotalcount](x: Self) {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
