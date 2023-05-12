package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath652RequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: Path652
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201ContentApplicationjsonRecord404Content36`
}
object ParametersPath652RequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: Path652,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201ContentApplicationjsonRecord404Content36`
  ): ParametersPath652RequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath652RequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath652RequestBodyContentApplicationjsonKeyidSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path652): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRecord404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
