package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashcredential-authorizationsSlashColoncredential_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsRemoveSamlSsoAuthorizationRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: `SlashorgsSlashColonorgSlashcredential-authorizationsSlashColoncredential_id`
}
object OrgsRemoveSamlSsoAuthorizationRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): OrgsRemoveSamlSsoAuthorizationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/orgs/:org/credential-authorizations/:credential_id")
    __obj.asInstanceOf[OrgsRemoveSamlSsoAuthorizationRequestOptions]
  }
  
  extension [Self <: OrgsRemoveSamlSsoAuthorizationRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashorgsSlashColonorgSlashcredential-authorizationsSlashColoncredential_id`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
