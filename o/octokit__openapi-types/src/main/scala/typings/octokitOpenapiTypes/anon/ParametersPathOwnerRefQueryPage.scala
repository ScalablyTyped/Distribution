package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefQueryPage extends StObject {
  
  var parameters: PathOwnerRefQueryPage
  
  var responses: `200Content218`
}
object ParametersPathOwnerRefQueryPage {
  
  inline def apply(parameters: PathOwnerRefQueryPage, responses: `200Content218`): ParametersPathOwnerRefQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRefQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRefQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content218`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
