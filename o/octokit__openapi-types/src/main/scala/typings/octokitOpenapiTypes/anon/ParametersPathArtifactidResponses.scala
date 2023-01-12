package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathArtifactidResponses extends StObject {
  
  var parameters: PathArtifactid
}
object ParametersPathArtifactidResponses {
  
  inline def apply(parameters: PathArtifactid): ParametersPathArtifactidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathArtifactidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathArtifactidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathArtifactid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
