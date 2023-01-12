package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReactionid extends StObject {
  
  var parameters: PathReactionid
}
object ParametersPathReactionid {
  
  inline def apply(parameters: PathReactionid): ParametersPathReactionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReactionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReactionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReactionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
