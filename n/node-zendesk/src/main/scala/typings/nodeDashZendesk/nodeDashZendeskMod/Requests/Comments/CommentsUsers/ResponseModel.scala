package typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.CommentsUsers

import typings.nodeDashZendesk.nodeDashZendeskMod.Attachments.Model
import typings.nodeDashZendesk.nodeDashZendeskMod.PersistableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends PersistableModel {
  val agent: Boolean
  val name: String
  val organization_id: Double | Null
  val photo: Model | Null
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: Boolean,
    id: ZendeskID,
    name: String,
    organization_id: Int | Double = null,
    photo: Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent, id = id, name = name)
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo)
    __obj.asInstanceOf[ResponseModel]
  }
}

