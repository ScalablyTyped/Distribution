package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyidResponses371 extends StObject {
  
  var parameters: PathSshsigningkeyid
  
  var responses: `371`
}
object ParametersPathSshsigningkeyidResponses371 {
  
  inline def apply(parameters: PathSshsigningkeyid, responses: `371`): ParametersPathSshsigningkeyidResponses371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyidResponses371]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSshsigningkeyidResponses371] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSshsigningkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `371`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
