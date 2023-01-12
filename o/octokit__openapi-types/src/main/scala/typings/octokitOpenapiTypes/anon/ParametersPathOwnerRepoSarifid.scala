package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSarifid extends StObject {
  
  var parameters: PathOwnerRepoSarifid
  
  var responses: `200ContentApplicationjsonAnalysesurl`
}
object ParametersPathOwnerRepoSarifid {
  
  inline def apply(parameters: PathOwnerRepoSarifid, responses: `200ContentApplicationjsonAnalysesurl`): ParametersPathOwnerRepoSarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoSarifid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoSarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAnalysesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
