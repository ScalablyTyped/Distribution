package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeMessageStatsResponse extends js.Object {
  
  /** The number of quota bytes accounted to these messages. */
  var messageBytes: js.UndefOr[String] = js.native
  
  /** The count of messages. */
  var messageCount: js.UndefOr[String] = js.native
  
  /**
    * The minimum event timestamp across these messages. For the purposes of this computation, if a message does not have an event time, we use the publish time. The timestamp will be
    * unset if there are no messages.
    */
  var minimumEventTime: js.UndefOr[String] = js.native
  
  /**
    * The minimum publish timestamp across these messages. Note that publish timestamps within a partition are not guaranteed to be non-decreasing. The timestamp will be unset if there
    * are no messages.
    */
  var minimumPublishTime: js.UndefOr[String] = js.native
}
object ComputeMessageStatsResponse {
  
  @scala.inline
  def apply(): ComputeMessageStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeMessageStatsResponse]
  }
  
  @scala.inline
  implicit class ComputeMessageStatsResponseOps[Self <: ComputeMessageStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setMessageBytes(value: String): Self = this.set("messageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageBytes: Self = this.set("messageBytes", js.undefined)
    
    @scala.inline
    def setMessageCount(value: String): Self = this.set("messageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageCount: Self = this.set("messageCount", js.undefined)
    
    @scala.inline
    def setMinimumEventTime(value: String): Self = this.set("minimumEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumEventTime: Self = this.set("minimumEventTime", js.undefined)
    
    @scala.inline
    def setMinimumPublishTime(value: String): Self = this.set("minimumPublishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPublishTime: Self = this.set("minimumPublishTime", js.undefined)
  }
}
