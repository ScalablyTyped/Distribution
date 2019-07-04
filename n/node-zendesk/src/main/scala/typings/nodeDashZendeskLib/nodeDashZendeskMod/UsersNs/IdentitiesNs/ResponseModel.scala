package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.AuditableModel {
  val deliverable_state: DeliverableState
  val primary: scala.Boolean
  val `type`: IdentityType
  val undeliverable_count: scala.Double
  val url: java.lang.String
  val user_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val value: java.lang.String
  val verified: scala.Boolean
}

object ResponseModel {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    deliverable_state: DeliverableState,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    primary: scala.Boolean,
    `type`: IdentityType,
    undeliverable_count: scala.Double,
    url: java.lang.String,
    user_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    value: java.lang.String,
    verified: scala.Boolean,
    updated_at: java.lang.String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at, deliverable_state = deliverable_state, id = id, primary = primary, undeliverable_count = undeliverable_count, url = url, user_id = user_id, value = value, verified = verified)
    __obj.updateDynamic("type")(`type`)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[ResponseModel]
  }
}

