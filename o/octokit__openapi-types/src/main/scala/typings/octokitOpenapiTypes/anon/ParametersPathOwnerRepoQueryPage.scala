package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoQueryPage extends StObject {
  
  var parameters: PathOwnerRepoQueryPage
  
  var responses: `403404500`
}
object ParametersPathOwnerRepoQueryPage {
  
  inline def apply(parameters: PathOwnerRepoQueryPage, responses: `403404500`): ParametersPathOwnerRepoQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoQueryPage]
  }
  
  extension [Self <: ParametersPathOwnerRepoQueryPage](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
