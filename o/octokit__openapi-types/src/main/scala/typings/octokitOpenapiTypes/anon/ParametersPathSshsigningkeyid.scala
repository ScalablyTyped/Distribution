package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyid extends StObject {
  
  var parameters: PathSshsigningkeyid
  
  var responses: `200Content378`
}
object ParametersPathSshsigningkeyid {
  
  inline def apply(parameters: PathSshsigningkeyid, responses: `200Content378`): ParametersPathSshsigningkeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSshsigningkeyid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSshsigningkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content378`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
