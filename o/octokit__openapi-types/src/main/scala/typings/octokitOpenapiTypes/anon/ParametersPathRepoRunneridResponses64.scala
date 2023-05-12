package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridResponses64 extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var responses: `64`
}
object ParametersPathRepoRunneridResponses64 {
  
  inline def apply(parameters: PathRepoRunnerid, responses: `64`): ParametersPathRepoRunneridResponses64 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridResponses64]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunneridResponses64] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `64`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
