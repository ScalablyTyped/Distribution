package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonEmailsExternalId extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `201ContentApplicationjsonEmailsExternalId`
}
object Responses201ContentApplicationjsonEmailsExternalId {
  
  inline def apply(
    parameters: PathEnterpriseString,
    requestBody: ContentApplicationjsonEmails,
    responses: `201ContentApplicationjsonEmailsExternalId`
  ): Responses201ContentApplicationjsonEmailsExternalId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonEmailsExternalId]
  }
  
  extension [Self <: Responses201ContentApplicationjsonEmailsExternalId](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonEmailsExternalId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
