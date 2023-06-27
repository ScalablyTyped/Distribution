package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonLabelsArrayTotalcountNumber extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `200ContentApplicationjsonLabelsArrayTotalcountNumber`
}
object Responses200ContentApplicationjsonLabelsArrayTotalcountNumber {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `200ContentApplicationjsonLabelsArrayTotalcountNumber`): Responses200ContentApplicationjsonLabelsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonLabelsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonLabelsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
