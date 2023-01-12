package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgReactionid extends StObject {
  
  var parameters: PathOrgReactionid
}
object ParametersPathOrgReactionid {
  
  inline def apply(parameters: PathOrgReactionid): ParametersPathOrgReactionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgReactionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgReactionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgReactionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
