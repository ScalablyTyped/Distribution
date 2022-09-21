package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidNumberQuery426 extends StObject {
  
  var parameters: PathInstallationidNumberQuery426
  
  var responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
}
object ParametersPathInstallationidNumberQuery426 {
  
  inline def apply(
    parameters: PathInstallationidNumberQuery426,
    responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
  ): ParametersPathInstallationidNumberQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidNumberQuery426]
  }
  
  extension [Self <: ParametersPathInstallationidNumberQuery426](x: Self) {
    
    inline def setParameters(value: PathInstallationidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
