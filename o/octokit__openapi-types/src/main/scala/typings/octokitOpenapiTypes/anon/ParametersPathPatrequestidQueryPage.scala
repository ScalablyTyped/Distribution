package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatrequestidQueryPage extends StObject {
  
  var parameters: PathPatrequestidQueryPage
  
  var responses: `404500`
}
object ParametersPathPatrequestidQueryPage {
  
  inline def apply(parameters: PathPatrequestidQueryPage, responses: `404500`): ParametersPathPatrequestidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatrequestidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatrequestidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatrequestidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
