package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArtifactidOwnerResponses extends StObject {
  
  var parameters: PathArtifactidOwner
}
object ParametersPathArtifactidOwnerResponses {
  
  inline def apply(parameters: PathArtifactidOwner): ParametersPathArtifactidOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArtifactidOwnerResponses]
  }
  
  extension [Self <: ParametersPathArtifactidOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathArtifactidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
