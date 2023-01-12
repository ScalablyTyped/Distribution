package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRepositoryidSecretnameResponses409Unknown extends StObject {
  
  var parameters: PathOrgRepositoryidSecretname
  
  var responses: `409Unknown`
}
object ParametersPathOrgRepositoryidSecretnameResponses409Unknown {
  
  inline def apply(parameters: PathOrgRepositoryidSecretname, responses: `409Unknown`): ParametersPathOrgRepositoryidSecretnameResponses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRepositoryidSecretnameResponses409Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRepositoryidSecretnameResponses409Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
