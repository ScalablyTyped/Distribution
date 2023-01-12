package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoResponses extends StObject {
  
  var parameters: PathRepo
}
object ParametersPathRepoResponses {
  
  inline def apply(parameters: PathRepo): ParametersPathRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
