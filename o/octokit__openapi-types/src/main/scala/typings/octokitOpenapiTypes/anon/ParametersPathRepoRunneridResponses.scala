package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridResponses extends StObject {
  
  var parameters: PathRepoRunnerid
}
object ParametersPathRepoRunneridResponses {
  
  inline def apply(parameters: PathRepoRunnerid): ParametersPathRepoRunneridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridResponses]
  }
  
  extension [Self <: ParametersPathRepoRunneridResponses](x: Self) {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
