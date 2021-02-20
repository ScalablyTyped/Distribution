package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchResponse extends StObject {
  
  /** When Gmail will stop sending notifications for mailbox updates (epoch millis). Call `watch` again before this time to renew the watch. */
  var expiration: js.UndefOr[String] = js.native
  
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[String] = js.native
}
object WatchResponse {
  
  @scala.inline
  def apply(): WatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchResponse]
  }
  
  @scala.inline
  implicit class WatchResponseMutableBuilder[Self <: WatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
  }
}
