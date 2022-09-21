package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEmailsExternalId extends StObject {
  
  var parameters: PathEnterpriseScimuserid
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `200ContentApplicationjsonEmailsExternalId`
}
object Responses200ContentApplicationjsonEmailsExternalId {
  
  inline def apply(
    parameters: PathEnterpriseScimuserid,
    requestBody: ContentApplicationjsonEmails,
    responses: `200ContentApplicationjsonEmailsExternalId`
  ): Responses200ContentApplicationjsonEmailsExternalId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEmailsExternalId]
  }
  
  extension [Self <: Responses200ContentApplicationjsonEmailsExternalId](x: Self) {
    
    inline def setParameters(value: PathEnterpriseScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEmailsExternalId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
