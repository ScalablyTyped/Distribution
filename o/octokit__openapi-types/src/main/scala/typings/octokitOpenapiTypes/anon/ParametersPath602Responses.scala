package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath602Responses extends StObject {
  
  var parameters: Path602
}
object ParametersPath602Responses {
  
  inline def apply(parameters: Path602): ParametersPath602Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath602Responses]
  }
  
  extension [Self <: ParametersPath602Responses](x: Self) {
    
    inline def setParameters(value: Path602): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
