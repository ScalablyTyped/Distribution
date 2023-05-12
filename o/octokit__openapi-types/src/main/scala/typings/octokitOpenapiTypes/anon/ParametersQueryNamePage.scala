package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryNamePage extends StObject {
  
  var parameters: QueryNamePage
  
  var responses: `200ContentApplicationjsonArtifacts`
}
object ParametersQueryNamePage {
  
  inline def apply(parameters: QueryNamePage, responses: `200ContentApplicationjsonArtifacts`): ParametersQueryNamePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryNamePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryNamePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryNamePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifacts`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
