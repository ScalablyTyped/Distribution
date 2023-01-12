package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidResponses extends StObject {
  
  var parameters: PathRunnergroupid
}
object ParametersPathRunnergroupidResponses {
  
  inline def apply(parameters: PathRunnergroupid): ParametersPathRunnergroupidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunnergroupidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
