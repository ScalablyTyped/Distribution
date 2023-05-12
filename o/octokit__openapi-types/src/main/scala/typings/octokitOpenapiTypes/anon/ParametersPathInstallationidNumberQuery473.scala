package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidNumberQuery473 extends StObject {
  
  var parameters: PathInstallationidNumberQuery473
  
  var responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
}
object ParametersPathInstallationidNumberQuery473 {
  
  inline def apply(
    parameters: PathInstallationidNumberQuery473,
    responses: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`
  ): ParametersPathInstallationidNumberQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidNumberQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
