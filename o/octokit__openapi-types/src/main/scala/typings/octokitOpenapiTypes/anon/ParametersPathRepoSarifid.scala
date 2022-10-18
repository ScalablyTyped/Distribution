package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSarifid extends StObject {
  
  var parameters: PathRepoSarifid
  
  var responses: `200ContentApplicationjsonAnalysesurl`
}
object ParametersPathRepoSarifid {
  
  inline def apply(parameters: PathRepoSarifid, responses: `200ContentApplicationjsonAnalysesurl`): ParametersPathRepoSarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSarifid]
  }
  
  extension [Self <: ParametersPathRepoSarifid](x: Self) {
    
    inline def setParameters(value: PathRepoSarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAnalysesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
