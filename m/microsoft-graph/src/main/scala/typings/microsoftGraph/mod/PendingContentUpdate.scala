package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingContentUpdate extends js.Object {
  
  // Date and time the pending binary operation was queued in UTC time. Read-only.
  var queuedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object PendingContentUpdate {
  
  @scala.inline
  def apply(): PendingContentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingContentUpdate]
  }
  
  @scala.inline
  implicit class PendingContentUpdateOps[Self <: PendingContentUpdate] (val x: Self) extends AnyVal {
    
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
    def setQueuedDateTime(value: NullableOption[String]): Self = this.set("queuedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueuedDateTime: Self = this.set("queuedDateTime", js.undefined)
    
    @scala.inline
    def setQueuedDateTimeNull: Self = this.set("queuedDateTime", null)
  }
}
