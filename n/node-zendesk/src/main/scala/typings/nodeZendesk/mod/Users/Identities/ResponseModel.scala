package typings.nodeZendesk.mod.Users.Identities

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends AuditableModel {
  val deliverable_state: DeliverableState
  val primary: Boolean
  val `type`: IdentityType
  val undeliverable_count: Double
  val url: String
  val user_id: ZendeskID
  val value: String
  val verified: Boolean
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
    verified: Boolean,
    updated_at: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deliverable_state = deliverable_state.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], undeliverable_count = undeliverable_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

