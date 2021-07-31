package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashnotificationsSlashthreadsSlashColonthread_idSlashsubscription
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashnotificationsSlashthreadsSlashColonthread_idSlashsubscription
}
object ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/notifications/threads/:thread_id/subscription")
    __obj.asInstanceOf[ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions]
  }
  
  @scala.inline
  implicit class ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptionsMutableBuilder[Self <: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashnotificationsSlashthreadsSlashColonthread_idSlashsubscription): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
