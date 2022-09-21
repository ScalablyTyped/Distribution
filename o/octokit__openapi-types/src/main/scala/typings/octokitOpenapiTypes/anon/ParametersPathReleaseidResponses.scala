package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReleaseidResponses extends StObject {
  
  var parameters: PathReleaseid
}
object ParametersPathReleaseidResponses {
  
  inline def apply(parameters: PathReleaseid): ParametersPathReleaseidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReleaseidResponses]
  }
  
  extension [Self <: ParametersPathReleaseidResponses](x: Self) {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
