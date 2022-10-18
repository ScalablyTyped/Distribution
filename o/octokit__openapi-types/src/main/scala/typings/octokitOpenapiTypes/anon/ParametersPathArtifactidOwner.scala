package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArtifactidOwner extends StObject {
  
  var parameters: PathArtifactidOwner
  
  var responses: `200Content397`
}
object ParametersPathArtifactidOwner {
  
  inline def apply(parameters: PathArtifactidOwner, responses: `200Content397`): ParametersPathArtifactidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArtifactidOwner]
  }
  
  extension [Self <: ParametersPathArtifactidOwner](x: Self) {
    
    inline def setParameters(value: PathArtifactidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
