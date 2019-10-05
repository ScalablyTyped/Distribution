package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import typings.nodeDashZendesk.nodeDashZendeskMod.AuditableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
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
    val __obj = js.Dynamic.literal(created_at = created_at, deliverable_state = deliverable_state, id = id, primary = primary, undeliverable_count = undeliverable_count, url = url, user_id = user_id, value = value, verified = verified)
    __obj.updateDynamic("type")(`type`)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[ResponseModel]
  }
}

