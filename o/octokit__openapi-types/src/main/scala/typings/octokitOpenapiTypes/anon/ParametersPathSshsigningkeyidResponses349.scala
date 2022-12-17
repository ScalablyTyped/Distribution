package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyidResponses349 extends StObject {
  
  var parameters: PathSshsigningkeyid
  
  var responses: `349`
}
object ParametersPathSshsigningkeyidResponses349 {
  
  inline def apply(parameters: PathSshsigningkeyid, responses: `349`): ParametersPathSshsigningkeyidResponses349 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyidResponses349]
  }
  
  extension [Self <: ParametersPathSshsigningkeyidResponses349](x: Self) {
    
    inline def setParameters(value: PathSshsigningkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
