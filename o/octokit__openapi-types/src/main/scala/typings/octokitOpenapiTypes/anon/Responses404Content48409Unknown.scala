package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content48409Unknown extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `404Content48409Unknown`
}
object Responses404Content48409Unknown {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `404Content48409Unknown`
  ): Responses404Content48409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content48409Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content48409Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
