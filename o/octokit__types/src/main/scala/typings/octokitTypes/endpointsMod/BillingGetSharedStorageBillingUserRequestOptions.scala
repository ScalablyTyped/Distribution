package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashusersSlashColonusernameSlashsettingsSlashbillingSlashshared-storage`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingGetSharedStorageBillingUserRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: GET = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: `SlashusersSlashColonusernameSlashsettingsSlashbillingSlashshared-storage` = js.native
}
object BillingGetSharedStorageBillingUserRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: `SlashusersSlashColonusernameSlashsettingsSlashbillingSlashshared-storage`
  ): BillingGetSharedStorageBillingUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetSharedStorageBillingUserRequestOptions]
  }
  
  @scala.inline
  implicit class BillingGetSharedStorageBillingUserRequestOptionsMutableBuilder[Self <: BillingGetSharedStorageBillingUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: `SlashusersSlashColonusernameSlashsettingsSlashbillingSlashshared-storage`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
