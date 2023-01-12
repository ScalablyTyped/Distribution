package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidQueryPage extends StObject {
  
  var parameters: PathRunnergroupidQueryPage
  
  var responses: `200ContentApplicationjsonOrganizations`
}
object ParametersPathRunnergroupidQueryPage {
  
  inline def apply(parameters: PathRunnergroupidQueryPage, responses: `200ContentApplicationjsonOrganizations`): ParametersPathRunnergroupidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunnergroupidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnergroupidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
