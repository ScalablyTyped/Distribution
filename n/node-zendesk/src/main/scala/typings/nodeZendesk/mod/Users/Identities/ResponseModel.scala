package typings.nodeZendesk.mod.Users.Identities

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseModel extends AuditableModel {
  
  val deliverable_state: DeliverableState = js.native
  
  val primary: Boolean = js.native
  
  val `type`: IdentityType = js.native
  
  val undeliverable_count: Double = js.native
  
  val url: String = js.native
  
  val user_id: ZendeskID = js.native
  
  val value: String = js.native
  
  val verified: Boolean = js.native
}
object ResponseModel {
  
  @scala.inline
  def apply(
    created_at: String,
    deliverable_state: DeliverableState,
    id: ZendeskID,
    primary: Boolean,
    `type`: IdentityType,
    undeliverable_count: Double,
    url: String,
    user_id: ZendeskID,
    value: String,
    verified: Boolean
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deliverable_state = deliverable_state.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], undeliverable_count = undeliverable_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    
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
    def setDeliverable_state(value: DeliverableState): Self = this.set("deliverable_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IdentityType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeliverable_count(value: Double): Self = this.set("undeliverable_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: ZendeskID): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
}
