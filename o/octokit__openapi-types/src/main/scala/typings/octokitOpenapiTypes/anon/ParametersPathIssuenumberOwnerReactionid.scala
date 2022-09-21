package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerReactionid extends StObject {
  
  var parameters: PathIssuenumberOwnerReactionid
}
object ParametersPathIssuenumberOwnerReactionid {
  
  inline def apply(parameters: PathIssuenumberOwnerReactionid): ParametersPathIssuenumberOwnerReactionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerReactionid]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerReactionid](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerReactionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
