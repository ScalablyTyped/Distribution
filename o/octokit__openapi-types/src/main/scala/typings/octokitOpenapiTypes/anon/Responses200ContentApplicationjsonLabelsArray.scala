package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathRunneridNumber
  
  var responses: `200ContentApplicationjsonLabelsArray`
}
object Responses200ContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: PathRunneridNumber, responses: `200ContentApplicationjsonLabelsArray`): Responses200ContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonLabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonLabelsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
