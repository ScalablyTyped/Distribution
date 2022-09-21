package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnerid extends StObject {
  
  var parameters: PathRunnerid
}
object ParametersPathRunnerid {
  
  inline def apply(parameters: PathRunnerid): ParametersPathRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnerid]
  }
  
  extension [Self <: ParametersPathRunnerid](x: Self) {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
