package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupidRunnerid extends StObject {
  
  var parameters: PathOrgRunnergroupidRunnerid
}
object ParametersPathOrgRunnergroupidRunnerid {
  
  inline def apply(parameters: PathOrgRunnergroupidRunnerid): ParametersPathOrgRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupidRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRunnergroupidRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRunnergroupidRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
