package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReactionidReleaseid extends StObject {
  
  var parameters: PathReactionidReleaseid
}
object ParametersPathReactionidReleaseid {
  
  inline def apply(parameters: PathReactionidReleaseid): ParametersPathReactionidReleaseid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReactionidReleaseid]
  }
  
  extension [Self <: ParametersPathReactionidReleaseid](x: Self) {
    
    inline def setParameters(value: PathReactionidReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
