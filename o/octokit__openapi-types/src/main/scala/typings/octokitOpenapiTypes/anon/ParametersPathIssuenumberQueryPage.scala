package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberQueryPage extends StObject {
  
  var parameters: PathIssuenumberQueryPage
  
  var responses: `200410`
}
object ParametersPathIssuenumberQueryPage {
  
  inline def apply(parameters: PathIssuenumberQueryPage, responses: `200410`): ParametersPathIssuenumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberQueryPage]
  }
  
  extension [Self <: ParametersPathIssuenumberQueryPage](x: Self) {
    
    inline def setParameters(value: PathIssuenumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
