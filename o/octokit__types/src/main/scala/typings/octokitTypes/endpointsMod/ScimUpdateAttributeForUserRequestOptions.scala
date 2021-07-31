package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsersSlashColonscim_user_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScimUpdateAttributeForUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PATCH
  
  var request: RequestRequestOptions
  
  var url: SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsersSlashColonscim_user_id
}
object ScimUpdateAttributeForUserRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ScimUpdateAttributeForUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PATCH", request = request.asInstanceOf[js.Any], url = "/scim/v2/organizations/:org/Users/:scim_user_id")
    __obj.asInstanceOf[ScimUpdateAttributeForUserRequestOptions]
  }
  
  @scala.inline
  implicit class ScimUpdateAttributeForUserRequestOptionsMutableBuilder[Self <: ScimUpdateAttributeForUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsersSlashColonscim_user_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
