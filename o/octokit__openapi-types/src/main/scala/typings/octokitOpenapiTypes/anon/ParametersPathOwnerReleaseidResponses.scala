package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidResponses extends StObject {
  
  var parameters: PathOwnerReleaseid
}
object ParametersPathOwnerReleaseidResponses {
  
  inline def apply(parameters: PathOwnerReleaseid): ParametersPathOwnerReleaseidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidResponses]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidResponses](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
