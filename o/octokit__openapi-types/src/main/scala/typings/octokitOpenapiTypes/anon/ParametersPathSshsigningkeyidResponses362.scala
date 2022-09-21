package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyidResponses362 extends StObject {
  
  var parameters: PathSshsigningkeyid
  
  var responses: `362`
}
object ParametersPathSshsigningkeyidResponses362 {
  
  inline def apply(parameters: PathSshsigningkeyid, responses: `362`): ParametersPathSshsigningkeyidResponses362 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyidResponses362]
  }
  
  extension [Self <: ParametersPathSshsigningkeyidResponses362](x: Self) {
    
    inline def setParameters(value: PathSshsigningkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `362`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
