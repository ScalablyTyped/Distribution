package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_number
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsUpdateDiscussionLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: PATCH = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_number = js.native
}
object TeamsUpdateDiscussionLegacyRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_number
  ): TeamsUpdateDiscussionLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsUpdateDiscussionLegacyRequestOptionsMutableBuilder[Self <: TeamsUpdateDiscussionLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_number): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
