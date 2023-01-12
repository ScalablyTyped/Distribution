package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidNumberQuery407 extends StObject {
  
  var parameters: PathInstallationidNumberQuery407
  
  var responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
}
object ParametersPathInstallationidNumberQuery407 {
  
  inline def apply(
    parameters: PathInstallationidNumberQuery407,
    responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
  ): ParametersPathInstallationidNumberQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidNumberQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationidNumberQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
