package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: PUT = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint = js.native
}
object OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PUT,
    request: RequestRequestOptions,
    url: SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptionsMutableBuilder[Self <: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashauthorizationsSlashclientsSlashColonclient_idSlashColonfingerprint): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
