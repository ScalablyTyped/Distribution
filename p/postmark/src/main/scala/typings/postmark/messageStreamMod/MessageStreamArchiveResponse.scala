package typings.postmark.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStreamArchiveResponse extends js.Object {
  
  var ExpectedPurgeDate: String = js.native
  
  var ID: Double = js.native
  
  var ServerID: Double = js.native
}
object MessageStreamArchiveResponse {
  
  @scala.inline
  def apply(ExpectedPurgeDate: String, ID: Double, ServerID: Double): MessageStreamArchiveResponse = {
    val __obj = js.Dynamic.literal(ExpectedPurgeDate = ExpectedPurgeDate.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStreamArchiveResponse]
  }
  
  @scala.inline
  implicit class MessageStreamArchiveResponseOps[Self <: MessageStreamArchiveResponse] (val x: Self) extends AnyVal {
    
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
    def setExpectedPurgeDate(value: String): Self = this.set("ExpectedPurgeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerID(value: Double): Self = this.set("ServerID", value.asInstanceOf[js.Any])
  }
}
