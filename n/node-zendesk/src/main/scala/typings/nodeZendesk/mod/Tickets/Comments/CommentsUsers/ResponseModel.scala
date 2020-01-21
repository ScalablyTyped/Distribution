package typings.nodeZendesk.mod.Tickets.Comments.CommentsUsers

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.Users.Role
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel {
  val role: Role
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: Boolean,
    id: ZendeskID,
    name: String,
    role: Role,
    organization_id: Int | Double = null,
    photo: Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

