package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRoleid extends StObject {
  
  var parameters: PathRoleid
}
object ParametersPathRoleid {
  
  inline def apply(parameters: PathRoleid): ParametersPathRoleid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRoleid]
  }
  
  extension [Self <: ParametersPathRoleid](x: Self) {
    
    inline def setParameters(value: PathRoleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
