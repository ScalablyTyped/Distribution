package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashusersSlashColonusernameSlashsettingsSlashbillingSlashactions
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetGithubActionsBillingUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashusersSlashColonusernameSlashsettingsSlashbillingSlashactions
}
object BillingGetGithubActionsBillingUserRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): BillingGetGithubActionsBillingUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/users/:username/settings/billing/actions")
    __obj.asInstanceOf[BillingGetGithubActionsBillingUserRequestOptions]
  }
  
  @scala.inline
  implicit class BillingGetGithubActionsBillingUserRequestOptionsMutableBuilder[Self <: BillingGetGithubActionsBillingUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashusersSlashColonusernameSlashsettingsSlashbillingSlashactions): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
