package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBuildidOwner extends StObject {
  
  var parameters: PathBuildidOwner
  
  var responses: `200ContentApplicationjsonCommitCreatedat`
}
object ParametersPathBuildidOwner {
  
  inline def apply(parameters: PathBuildidOwner, responses: `200ContentApplicationjsonCommitCreatedat`): ParametersPathBuildidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBuildidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBuildidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBuildidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommitCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
