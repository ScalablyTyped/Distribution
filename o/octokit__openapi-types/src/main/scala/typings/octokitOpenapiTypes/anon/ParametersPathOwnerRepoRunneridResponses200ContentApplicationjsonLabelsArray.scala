package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var responses: `200ContentApplicationjsonLabelsArray`
}
object ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: PathOwnerRepoRunnerid, responses: `200ContentApplicationjsonLabelsArray`): ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
