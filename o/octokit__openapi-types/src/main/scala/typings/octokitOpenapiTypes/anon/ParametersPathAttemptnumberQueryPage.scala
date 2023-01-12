package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberQueryPage extends StObject {
  
  var parameters: PathAttemptnumberQueryPage
  
  var responses: `200ContentApplicationjsonJobs`
}
object ParametersPathAttemptnumberQueryPage {
  
  inline def apply(parameters: PathAttemptnumberQueryPage, responses: `200ContentApplicationjsonJobs`): ParametersPathAttemptnumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
