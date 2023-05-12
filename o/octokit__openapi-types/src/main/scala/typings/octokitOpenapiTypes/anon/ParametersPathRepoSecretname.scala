package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSecretname extends StObject {
  
  var parameters: PathRepoSecretname
  
  var responses: `200Content162`
}
object ParametersPathRepoSecretname {
  
  inline def apply(parameters: PathRepoSecretname, responses: `200Content162`): ParametersPathRepoSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoSecretname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content162`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
