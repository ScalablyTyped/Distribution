package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcastStatistics extends js.Object {
  
  /**
    * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live chat feature enabled, and has
    * at least one message. Note that this field will not be filled after the broadcast ends. So this property would not identify the number of chat messages for an archived video of a
    * completed live broadcast.
    */
  var totalChatCount: js.UndefOr[String] = js.native
}
object LiveBroadcastStatistics {
  
  @scala.inline
  def apply(): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
  
  @scala.inline
  implicit class LiveBroadcastStatisticsOps[Self <: LiveBroadcastStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTotalChatCount(value: String): Self = this.set("totalChatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalChatCount: Self = this.set("totalChatCount", js.undefined)
  }
}
