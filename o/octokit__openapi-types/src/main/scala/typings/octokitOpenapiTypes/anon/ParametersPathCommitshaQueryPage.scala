package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaQueryPage extends StObject {
  
  var parameters: PathCommitshaQueryPage
  
  var responses: `200Content195`
}
object ParametersPathCommitshaQueryPage {
  
  inline def apply(parameters: PathCommitshaQueryPage, responses: `200Content195`): ParametersPathCommitshaQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaQueryPage]
  }
  
  extension [Self <: ParametersPathCommitshaQueryPage](x: Self) {
    
    inline def setParameters(value: PathCommitshaQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content195`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
