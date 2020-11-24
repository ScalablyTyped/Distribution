package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeMessageStatsRequest extends js.Object {
  
  /**
    * The exclusive end of the range. The range is empty if end_cursor <= start_cursor. Specifying a start_cursor before the first message and an end_cursor after the last message will
    * retrieve all messages.
    */
  var endCursor: js.UndefOr[Cursor] = js.native
  
  /** Required. The partition for which we should compute message stats. */
  var partition: js.UndefOr[String] = js.native
  
  /** The inclusive start of the range. */
  var startCursor: js.UndefOr[Cursor] = js.native
}
object ComputeMessageStatsRequest {
  
  @scala.inline
  def apply(): ComputeMessageStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeMessageStatsRequest]
  }
  
  @scala.inline
  implicit class ComputeMessageStatsRequestOps[Self <: ComputeMessageStatsRequest] (val x: Self) extends AnyVal {
    
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
    def setEndCursor(value: Cursor): Self = this.set("endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndCursor: Self = this.set("endCursor", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    
    @scala.inline
    def setStartCursor(value: Cursor): Self = this.set("startCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCursor: Self = this.set("startCursor", js.undefined)
  }
}
