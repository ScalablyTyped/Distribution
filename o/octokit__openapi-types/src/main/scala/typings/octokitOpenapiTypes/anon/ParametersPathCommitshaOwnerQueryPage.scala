package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwnerQueryPage extends StObject {
  
  var parameters: PathCommitshaOwnerQueryPage
  
  var responses: `200Content110`
}
object ParametersPathCommitshaOwnerQueryPage {
  
  inline def apply(parameters: PathCommitshaOwnerQueryPage, responses: `200Content110`): ParametersPathCommitshaOwnerQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwnerQueryPage]
  }
  
  extension [Self <: ParametersPathCommitshaOwnerQueryPage](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content110`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
