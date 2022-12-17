package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunid extends StObject {
  
  var parameters: PathRepoRunid
  
  var responses: `200ContentApplicationjsonCancelurl`
}
object ParametersPathRepoRunid {
  
  inline def apply(parameters: PathRepoRunid, responses: `200ContentApplicationjsonCancelurl`): ParametersPathRepoRunid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunid]
  }
  
  extension [Self <: ParametersPathRepoRunid](x: Self) {
    
    inline def setParameters(value: PathRepoRunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCancelurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
