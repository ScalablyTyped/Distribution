package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRunneridNumberResponses200ContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathOrgStringRunneridNumber
  
  var responses: `200ContentApplicationjsonLabelsArray`
}
object ParametersPathOrgStringRunneridNumberResponses200ContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: PathOrgStringRunneridNumber, responses: `200ContentApplicationjsonLabelsArray`): ParametersPathOrgStringRunneridNumberResponses200ContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRunneridNumberResponses200ContentApplicationjsonLabelsArray]
  }
  
  extension [Self <: ParametersPathOrgStringRunneridNumberResponses200ContentApplicationjsonLabelsArray](x: Self) {
    
    inline def setParameters(value: PathOrgStringRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
