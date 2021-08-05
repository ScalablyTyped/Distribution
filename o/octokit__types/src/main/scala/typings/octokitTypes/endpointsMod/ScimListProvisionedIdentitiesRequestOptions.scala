package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScimListProvisionedIdentitiesRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers
}
object ScimListProvisionedIdentitiesRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ScimListProvisionedIdentitiesRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/scim/v2/organizations/:org/Users")
    __obj.asInstanceOf[ScimListProvisionedIdentitiesRequestOptions]
  }
  
  extension [Self <: ScimListProvisionedIdentitiesRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
