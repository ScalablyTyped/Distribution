package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReponame extends StObject {
  
  var parameters: PathReponame
  
  var responses: `7`
}
object ParametersPathReponame {
  
  inline def apply(parameters: PathReponame, responses: `7`): ParametersPathReponame = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReponame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReponame] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReponame): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
