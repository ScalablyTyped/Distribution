package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchResponse extends StObject {
  
  /** When Gmail will stop sending notifications for mailbox updates (epoch millis). Call `watch` again before this time to renew the watch. */
  var expiration: js.UndefOr[String] = js.undefined
  
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[String] = js.undefined
}
object WatchResponse {
  
  inline def apply(): WatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchResponse]
  }
  
  extension [Self <: WatchResponse](x: Self) {
    
    inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
  }
}
