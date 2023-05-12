package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCardidNumber extends StObject {
  
  var parameters: PathCardidNumber
  
  var responses: `200ContentApplicationjsonArchivedColumnname`
}
object ParametersPathCardidNumber {
  
  inline def apply(parameters: PathCardidNumber, responses: `200ContentApplicationjsonArchivedColumnname`): ParametersPathCardidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCardidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCardidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArchivedColumnname`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
