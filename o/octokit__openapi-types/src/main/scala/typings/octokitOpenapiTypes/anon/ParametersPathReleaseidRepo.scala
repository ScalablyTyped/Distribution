package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReleaseidRepo extends StObject {
  
  var parameters: PathReleaseidRepo
}
object ParametersPathReleaseidRepo {
  
  inline def apply(parameters: PathReleaseidRepo): ParametersPathReleaseidRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReleaseidRepo]
  }
  
  extension [Self <: ParametersPathReleaseidRepo](x: Self) {
    
    inline def setParameters(value: PathReleaseidRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
