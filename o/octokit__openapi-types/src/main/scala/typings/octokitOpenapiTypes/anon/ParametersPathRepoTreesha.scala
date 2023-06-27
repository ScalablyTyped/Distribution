package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTreesha extends StObject {
  
  var parameters: PathRepoTreesha
  
  var responses: `200702`
}
object ParametersPathRepoTreesha {
  
  inline def apply(parameters: PathRepoTreesha, responses: `200702`): ParametersPathRepoTreesha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTreesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoTreesha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoTreesha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200702`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
