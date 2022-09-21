package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidRepositoryid extends StObject {
  
  var parameters: PathInstallationidRepositoryid
  
  var responses: `304403404`
}
object ParametersPathInstallationidRepositoryid {
  
  inline def apply(parameters: PathInstallationidRepositoryid, responses: `304403404`): ParametersPathInstallationidRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidRepositoryid]
  }
  
  extension [Self <: ParametersPathInstallationidRepositoryid](x: Self) {
    
    inline def setParameters(value: PathInstallationidRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
