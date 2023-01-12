package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoStringResponses extends StObject {
  
  var parameters: PathRepoString
}
object ParametersPathRepoStringResponses {
  
  inline def apply(parameters: PathRepoString): ParametersPathRepoStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoStringResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoStringResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
