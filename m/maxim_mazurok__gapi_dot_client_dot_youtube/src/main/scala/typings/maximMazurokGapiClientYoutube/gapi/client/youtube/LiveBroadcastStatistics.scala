package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveBroadcastStatistics extends StObject {
  
  /**
    * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live chat feature enabled, and has
    * at least one message. Note that this field will not be filled after the broadcast ends. So this property would not identify the number of chat messages for an archived video of a
    * completed live broadcast.
    */
  var totalChatCount: js.UndefOr[String] = js.undefined
}
object LiveBroadcastStatistics {
  
  @scala.inline
  def apply(): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
  
  @scala.inline
  implicit class LiveBroadcastStatisticsMutableBuilder[Self <: LiveBroadcastStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalChatCount(value: String): Self = StObject.set(x, "totalChatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalChatCountUndefined: Self = StObject.set(x, "totalChatCount", js.undefined)
  }
}
