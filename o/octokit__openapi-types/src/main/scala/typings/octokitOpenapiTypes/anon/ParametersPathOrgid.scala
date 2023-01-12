package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgid extends StObject {
  
  var parameters: PathOrgid
}
object ParametersPathOrgid {
  
  inline def apply(parameters: PathOrgid): ParametersPathOrgid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
