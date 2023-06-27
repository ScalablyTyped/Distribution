package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath790RequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: Path790
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201ContentApplicationjsonRecord404Content41`
}
object ParametersPath790RequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: Path790,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201ContentApplicationjsonRecord404Content41`
  ): ParametersPath790RequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath790RequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath790RequestBodyContentApplicationjsonKeyidSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path790): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRecord404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
