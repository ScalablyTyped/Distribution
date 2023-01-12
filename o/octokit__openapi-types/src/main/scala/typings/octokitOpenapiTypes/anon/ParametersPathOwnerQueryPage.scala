package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerQueryPage extends StObject {
  
  var parameters: PathOwnerQueryPage
  
  var responses: `403404500`
}
object ParametersPathOwnerQueryPage {
  
  inline def apply(parameters: PathOwnerQueryPage, responses: `403404500`): ParametersPathOwnerQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
