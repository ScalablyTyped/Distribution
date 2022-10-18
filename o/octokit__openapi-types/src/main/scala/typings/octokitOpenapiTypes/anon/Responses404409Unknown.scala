package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404409Unknown extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `404409Unknown`
}
object Responses404409Unknown {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `404409Unknown`
  ): Responses404409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404409Unknown]
  }
  
  extension [Self <: Responses404409Unknown](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
