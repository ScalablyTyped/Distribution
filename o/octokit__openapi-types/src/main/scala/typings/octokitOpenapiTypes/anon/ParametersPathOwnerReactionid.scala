package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReactionid extends StObject {
  
  var parameters: PathOwnerReactionid
}
object ParametersPathOwnerReactionid {
  
  inline def apply(parameters: PathOwnerReactionid): ParametersPathOwnerReactionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReactionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReactionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReactionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
