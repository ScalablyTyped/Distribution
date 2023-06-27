package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidQuery extends StObject {
  
  var parameters: PathInstallationidQuery
  
  var responses: `200ContentApplicationjsonRepositoriesRepositoryselection`
}
object ParametersPathInstallationidQuery {
  
  inline def apply(
    parameters: PathInstallationidQuery,
    responses: `200ContentApplicationjsonRepositoriesRepositoryselection`
  ): ParametersPathInstallationidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesRepositoryselection`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
