package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsSetSelectedReposForOrgSecretRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories
}
object ActionsSetSelectedReposForOrgSecretRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ActionsSetSelectedReposForOrgSecretRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/orgs/:org/actions/secrets/:secret_name/repositories")
    __obj.asInstanceOf[ActionsSetSelectedReposForOrgSecretRequestOptions]
  }
  
  @scala.inline
  implicit class ActionsSetSelectedReposForOrgSecretRequestOptionsMutableBuilder[Self <: ActionsSetSelectedReposForOrgSecretRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
