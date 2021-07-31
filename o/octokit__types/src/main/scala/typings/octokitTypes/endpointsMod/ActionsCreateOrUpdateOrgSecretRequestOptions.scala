package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_name
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateOrUpdateOrgSecretRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_name
}
object ActionsCreateOrUpdateOrgSecretRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsCreateOrUpdateOrgSecretRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/orgs/:org/actions/secrets/:secret_name")
    __obj.asInstanceOf[ActionsCreateOrUpdateOrgSecretRequestOptions]
  }
  
  @scala.inline
  implicit class ActionsCreateOrUpdateOrgSecretRequestOptionsMutableBuilder[Self <: ActionsCreateOrUpdateOrgSecretRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_name): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
