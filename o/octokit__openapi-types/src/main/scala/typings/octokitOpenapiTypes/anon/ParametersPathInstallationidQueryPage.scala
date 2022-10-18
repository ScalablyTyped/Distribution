package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidQueryPage extends StObject {
  
  var parameters: PathInstallationidQueryPage
  
  var responses: `200ContentApplicationjsonRepositoryselectionTotalcount`
}
object ParametersPathInstallationidQueryPage {
  
  inline def apply(
    parameters: PathInstallationidQueryPage,
    responses: `200ContentApplicationjsonRepositoryselectionTotalcount`
  ): ParametersPathInstallationidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidQueryPage]
  }
  
  extension [Self <: ParametersPathInstallationidQueryPage](x: Self) {
    
    inline def setParameters(value: PathInstallationidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
