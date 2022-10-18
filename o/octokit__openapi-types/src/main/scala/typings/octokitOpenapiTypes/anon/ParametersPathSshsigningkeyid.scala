package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyid extends StObject {
  
  var parameters: PathSshsigningkeyid
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object ParametersPathSshsigningkeyid {
  
  inline def apply(parameters: PathSshsigningkeyid, responses: `200ContentApplicationjsonCreatedatId`): ParametersPathSshsigningkeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyid]
  }
  
  extension [Self <: ParametersPathSshsigningkeyid](x: Self) {
    
    inline def setParameters(value: PathSshsigningkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
