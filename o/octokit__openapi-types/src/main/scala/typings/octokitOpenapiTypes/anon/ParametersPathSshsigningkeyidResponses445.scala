package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyidResponses445 extends StObject {
  
  var parameters: PathSshsigningkeyid
  
  var responses: `445`
}
object ParametersPathSshsigningkeyidResponses445 {
  
  inline def apply(parameters: PathSshsigningkeyid, responses: `445`): ParametersPathSshsigningkeyidResponses445 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyidResponses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSshsigningkeyidResponses445] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSshsigningkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
