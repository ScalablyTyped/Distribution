package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.CommentsUsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CommentsUsersNs.ResponseModel {
  val role: nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.Role
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: scala.Boolean,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    name: java.lang.String,
    role: nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.Role,
    organization_id: scala.Int | scala.Double = null,
    photo: nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent, id = id, name = name, role = role)
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo)
    __obj.asInstanceOf[ResponseModel]
  }
}

