package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatMessageDeletedDetails extends js.Object {
  
  var deletedMessageId: js.UndefOr[String] = js.native
}
object LiveChatMessageDeletedDetails {
  
  @scala.inline
  def apply(): LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageDeletedDetails]
  }
  
  @scala.inline
  implicit class LiveChatMessageDeletedDetailsOps[Self <: LiveChatMessageDeletedDetails] (val x: Self) extends AnyVal {
    
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
    def setDeletedMessageId(value: String): Self = this.set("deletedMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedMessageId: Self = this.set("deletedMessageId", js.undefined)
  }
}
