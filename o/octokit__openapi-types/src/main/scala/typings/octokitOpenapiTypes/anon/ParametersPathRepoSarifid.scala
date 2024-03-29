package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSarifid extends StObject {
  
  var parameters: PathRepoSarifid
  
  var responses: `200403503`
}
object ParametersPathRepoSarifid {
  
  inline def apply(parameters: PathRepoSarifid, responses: `200403503`): ParametersPathRepoSarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoSarifid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
