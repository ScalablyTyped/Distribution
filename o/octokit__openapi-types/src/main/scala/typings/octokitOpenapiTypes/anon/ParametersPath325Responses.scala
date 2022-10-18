package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath325Responses extends StObject {
  
  var parameters: Path325
}
object ParametersPath325Responses {
  
  inline def apply(parameters: Path325): ParametersPath325Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath325Responses]
  }
  
  extension [Self <: ParametersPath325Responses](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
