package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTagprotectionid extends StObject {
  
  var parameters: PathRepoTagprotectionid
  
  var responses: `345`
}
object ParametersPathRepoTagprotectionid {
  
  inline def apply(parameters: PathRepoTagprotectionid, responses: `345`): ParametersPathRepoTagprotectionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTagprotectionid]
  }
  
  extension [Self <: ParametersPathRepoTagprotectionid](x: Self) {
    
    inline def setParameters(value: PathRepoTagprotectionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `345`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
