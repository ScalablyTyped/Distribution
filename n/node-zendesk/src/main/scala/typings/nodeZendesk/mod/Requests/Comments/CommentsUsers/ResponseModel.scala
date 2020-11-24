package typings.nodeZendesk.mod.Requests.Comments.CommentsUsers

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.PersistableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseModel extends PersistableModel {
  
  val agent: Boolean = js.native
  
  val name: String = js.native
  
  val organization_id: Double | Null = js.native
  
  val photo: Model | Null = js.native
}
object ResponseModel {
  
  @scala.inline
  def apply(agent: Boolean, id: ZendeskID, name: String): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
    def setAgent(value: Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_id(value: Double): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_idNull: Self = this.set("organization_id", null)
    
    @scala.inline
    def setPhoto(value: Model): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
  }
}
