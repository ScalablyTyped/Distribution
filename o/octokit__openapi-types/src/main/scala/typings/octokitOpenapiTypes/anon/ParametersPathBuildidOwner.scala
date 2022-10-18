package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBuildidOwner extends StObject {
  
  var parameters: PathBuildidOwner
  
  var responses: `200Content555`
}
object ParametersPathBuildidOwner {
  
  inline def apply(parameters: PathBuildidOwner, responses: `200Content555`): ParametersPathBuildidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBuildidOwner]
  }
  
  extension [Self <: ParametersPathBuildidOwner](x: Self) {
    
    inline def setParameters(value: PathBuildidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content555`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
