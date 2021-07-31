package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroupsSlashColonscim_group_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroupsSlashColonscim_group_id
}
object EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/scim/v2/enterprises/:enterprise/Groups/:scim_group_id")
    __obj.asInstanceOf[EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptionsMutableBuilder[Self <: EnterpriseAdminSetInformationForProvisionedEnterpriseGroupRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroupsSlashColonscim_group_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
