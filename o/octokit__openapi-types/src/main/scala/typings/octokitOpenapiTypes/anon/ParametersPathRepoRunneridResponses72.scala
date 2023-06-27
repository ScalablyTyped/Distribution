package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridResponses72 extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var responses: `72`
}
object ParametersPathRepoRunneridResponses72 {
  
  inline def apply(parameters: PathRepoRunnerid, responses: `72`): ParametersPathRepoRunneridResponses72 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridResponses72]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunneridResponses72] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `72`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
