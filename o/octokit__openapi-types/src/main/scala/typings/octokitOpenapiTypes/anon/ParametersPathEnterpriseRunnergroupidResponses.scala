package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidResponses extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
}
object ParametersPathEnterpriseRunnergroupidResponses {
  
  inline def apply(parameters: PathEnterpriseRunnergroupid): ParametersPathEnterpriseRunnergroupidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseRunnergroupidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
