package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidNumberQuery extends StObject {
  
  var parameters: PathInstallationidNumberQuery
  
  var responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
}
object ParametersPathInstallationidNumberQuery {
  
  inline def apply(
    parameters: PathInstallationidNumberQuery,
    responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
  ): ParametersPathInstallationidNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
