package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunidQueryPage extends StObject {
  
  var parameters: PathRunidQueryPage
  
  var responses: `200ContentApplicationjsonArtifacts`
}
object ParametersPathRunidQueryPage {
  
  inline def apply(parameters: PathRunidQueryPage, responses: `200ContentApplicationjsonArtifacts`): ParametersPathRunidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunidQueryPage]
  }
  
  extension [Self <: ParametersPathRunidQueryPage](x: Self) {
    
    inline def setParameters(value: PathRunidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifacts`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
