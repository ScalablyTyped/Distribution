package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergePayload extends js.Object {
  
  val ids: js.Array[ZendeskID] = js.native
  
  val source_comment: js.UndefOr[String | Null] = js.native
  
  val target_comment: js.UndefOr[String | Null] = js.native
}
object MergePayload {
  
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): MergePayload = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePayload]
  }
  
  @scala.inline
  implicit class MergePayloadOps[Self <: MergePayload] (val x: Self) extends AnyVal {
    
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
    def setIdsVarargs(value: ZendeskID*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[ZendeskID]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_comment(value: String): Self = this.set("source_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_comment: Self = this.set("source_comment", js.undefined)
    
    @scala.inline
    def setSource_commentNull: Self = this.set("source_comment", null)
    
    @scala.inline
    def setTarget_comment(value: String): Self = this.set("target_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_comment: Self = this.set("target_comment", js.undefined)
    
    @scala.inline
    def setTarget_commentNull: Self = this.set("target_comment", null)
  }
}
