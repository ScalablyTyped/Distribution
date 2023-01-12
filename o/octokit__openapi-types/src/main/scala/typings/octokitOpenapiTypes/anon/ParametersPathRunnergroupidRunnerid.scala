package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidRunnerid extends StObject {
  
  var parameters: PathRunnergroupidRunnerid
}
object ParametersPathRunnergroupidRunnerid {
  
  inline def apply(parameters: PathRunnergroupidRunnerid): ParametersPathRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunnergroupidRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnergroupidRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
