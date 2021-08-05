package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroupsSlashColonscim_group_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PATCH
  
  var request: RequestRequestOptions
  
  var url: SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroupsSlashColonscim_group_id
}
object EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PATCH", request = request.asInstanceOf[js.Any], url = "/scim/v2/enterprises/:enterprise/Groups/:scim_group_id")
    __obj.asInstanceOf[EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions]
  }
  
  extension [Self <: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroupsSlashColonscim_group_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
