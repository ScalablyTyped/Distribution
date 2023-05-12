package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoStatusid extends StObject {
  
  var parameters: PathRepoStatusid
  
  var responses: `200578`
}
object ParametersPathRepoStatusid {
  
  inline def apply(parameters: PathRepoStatusid, responses: `200578`): ParametersPathRepoStatusid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoStatusid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoStatusid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoStatusid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200578`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
