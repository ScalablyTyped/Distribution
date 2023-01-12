package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidQueryPage extends StObject {
  
  var parameters: PathInstallationidQueryPage
  
  var responses: `200ContentApplicationjsonRepositoriesRepositoryselection`
}
object ParametersPathInstallationidQueryPage {
  
  inline def apply(
    parameters: PathInstallationidQueryPage,
    responses: `200ContentApplicationjsonRepositoriesRepositoryselection`
  ): ParametersPathInstallationidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesRepositoryselection`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
