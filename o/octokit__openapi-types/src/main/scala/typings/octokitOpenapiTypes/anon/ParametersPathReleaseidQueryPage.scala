package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReleaseidQueryPage extends StObject {
  
  var parameters: PathReleaseidQueryPage
  
  var responses: `200Content334`
}
object ParametersPathReleaseidQueryPage {
  
  inline def apply(parameters: PathReleaseidQueryPage, responses: `200Content334`): ParametersPathReleaseidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReleaseidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReleaseidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReleaseidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content334`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
