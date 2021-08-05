package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsersSlashColonscim_user_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsersSlashColonscim_user_id
}
object EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/scim/v2/enterprises/:enterprise/Users/:scim_user_id")
    __obj.asInstanceOf[EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions]
  }
  
  extension [Self <: EnterpriseAdminGetProvisioningInformationForEnterpriseUserRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsersSlashColonscim_user_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
