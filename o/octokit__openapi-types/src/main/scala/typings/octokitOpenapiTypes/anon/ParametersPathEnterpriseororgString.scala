package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseororgString extends StObject {
  
  var parameters: PathEnterpriseororgString
  
  var responses: `200Content406`
}
object ParametersPathEnterpriseororgString {
  
  inline def apply(parameters: PathEnterpriseororgString, responses: `200Content406`): ParametersPathEnterpriseororgString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseororgString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseororgString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseororgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content406`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
