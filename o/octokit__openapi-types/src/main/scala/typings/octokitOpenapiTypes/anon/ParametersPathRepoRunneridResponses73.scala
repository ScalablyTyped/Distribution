package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridResponses73 extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var responses: `73`
}
object ParametersPathRepoRunneridResponses73 {
  
  inline def apply(parameters: PathRepoRunnerid, responses: `73`): ParametersPathRepoRunneridResponses73 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridResponses73]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunneridResponses73] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `73`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
