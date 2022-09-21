package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrg extends StObject {
  
  var parameters: PathDiscussionnumberOrg
}
object ParametersPathDiscussionnumberOrg {
  
  inline def apply(parameters: PathDiscussionnumberOrg): ParametersPathDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrg]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrg](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
