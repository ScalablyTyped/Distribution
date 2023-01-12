package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var responses: `200ContentApplicationjsonLabelsArray`
}
object ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: PathRepoRunnerid, responses: `200ContentApplicationjsonLabelsArray`): ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunneridResponses200ContentApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
