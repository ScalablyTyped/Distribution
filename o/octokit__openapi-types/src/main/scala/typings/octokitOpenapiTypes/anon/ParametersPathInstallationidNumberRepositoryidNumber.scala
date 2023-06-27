package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidNumberRepositoryidNumber extends StObject {
  
  var parameters: PathInstallationidNumberRepositoryidNumber
  
  var responses: `304403Content41`
}
object ParametersPathInstallationidNumberRepositoryidNumber {
  
  inline def apply(parameters: PathInstallationidNumberRepositoryidNumber, responses: `304403Content41`): ParametersPathInstallationidNumberRepositoryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidNumberRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationidNumberRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationidNumberRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
