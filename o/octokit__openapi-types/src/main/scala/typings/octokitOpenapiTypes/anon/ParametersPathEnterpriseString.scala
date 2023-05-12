package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseString extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `200304403404422`
}
object ParametersPathEnterpriseString {
  
  inline def apply(parameters: PathEnterpriseString, responses: `200304403404422`): ParametersPathEnterpriseString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
