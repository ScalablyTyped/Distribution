package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberQueryContentPage extends StObject {
  
  var parameters: PathIssuenumberQueryContentPage
  
  var responses: `200Content118404410`
}
object ParametersPathIssuenumberQueryContentPage {
  
  inline def apply(parameters: PathIssuenumberQueryContentPage, responses: `200Content118404410`): ParametersPathIssuenumberQueryContentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberQueryContentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberQueryContentPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberQueryContentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content118404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
