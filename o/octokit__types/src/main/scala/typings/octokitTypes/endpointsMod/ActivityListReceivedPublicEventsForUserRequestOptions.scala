package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashusersSlashColonusernameSlashreceived_eventsSlashpublic
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityListReceivedPublicEventsForUserRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashusersSlashColonusernameSlashreceived_eventsSlashpublic
}
object ActivityListReceivedPublicEventsForUserRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ActivityListReceivedPublicEventsForUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/users/:username/received_events/public")
    __obj.asInstanceOf[ActivityListReceivedPublicEventsForUserRequestOptions]
  }
  
  @scala.inline
  implicit class ActivityListReceivedPublicEventsForUserRequestOptionsMutableBuilder[Self <: ActivityListReceivedPublicEventsForUserRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashusersSlashColonusernameSlashreceived_eventsSlashpublic): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
