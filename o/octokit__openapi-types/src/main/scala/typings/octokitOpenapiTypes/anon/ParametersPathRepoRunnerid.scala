package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunnerid extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var responses: `200Content71`
}
object ParametersPathRepoRunnerid {
  
  inline def apply(parameters: PathRepoRunnerid, responses: `200Content71`): ParametersPathRepoRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content71`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
