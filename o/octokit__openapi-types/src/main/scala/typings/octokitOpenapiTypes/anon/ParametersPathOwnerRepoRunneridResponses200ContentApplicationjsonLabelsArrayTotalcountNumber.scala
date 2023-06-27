package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArrayTotalcountNumber extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var responses: `200ContentApplicationjsonLabelsArrayTotalcountNumber`
}
object ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArrayTotalcountNumber {
  
  inline def apply(
    parameters: PathOwnerRepoRunnerid,
    responses: `200ContentApplicationjsonLabelsArrayTotalcountNumber`
  ): ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRunneridResponses200ContentApplicationjsonLabelsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
