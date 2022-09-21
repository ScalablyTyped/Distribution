package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberQuerySince extends StObject {
  
  var parameters: PathIssuenumberQuerySince
  
  var responses: `200404410`
}
object ParametersPathIssuenumberQuerySince {
  
  inline def apply(parameters: PathIssuenumberQuerySince, responses: `200404410`): ParametersPathIssuenumberQuerySince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberQuerySince]
  }
  
  extension [Self <: ParametersPathIssuenumberQuerySince](x: Self) {
    
    inline def setParameters(value: PathIssuenumberQuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
