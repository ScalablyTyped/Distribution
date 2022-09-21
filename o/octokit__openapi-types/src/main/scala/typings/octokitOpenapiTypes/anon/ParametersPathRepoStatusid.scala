package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoStatusid extends StObject {
  
  var parameters: PathRepoStatusid
  
  var responses: `200530`
}
object ParametersPathRepoStatusid {
  
  inline def apply(parameters: PathRepoStatusid, responses: `200530`): ParametersPathRepoStatusid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoStatusid]
  }
  
  extension [Self <: ParametersPathRepoStatusid](x: Self) {
    
    inline def setParameters(value: PathRepoStatusid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200530`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
