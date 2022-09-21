package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReactionidRepo extends StObject {
  
  var parameters: PathReactionidRepo
}
object ParametersPathReactionidRepo {
  
  inline def apply(parameters: PathReactionidRepo): ParametersPathReactionidRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReactionidRepo]
  }
  
  extension [Self <: ParametersPathReactionidRepo](x: Self) {
    
    inline def setParameters(value: PathReactionidRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
