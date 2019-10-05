package typings.nodeDashZendesk.nodeDashZendeskMod.Organizations

import typings.nodeDashZendesk.nodeDashZendeskMod.AuditableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends AuditableModel {
  var details: js.UndefOr[String | Null] = js.undefined
  var domain_names: js.UndefOr[js.Array[String]] = js.undefined
  var external_id: js.UndefOr[String | Null] = js.undefined
  var group_id: js.UndefOr[Double | Null] = js.undefined
  var name: String
  var notes: js.UndefOr[String | Null] = js.undefined
  var organization_fields: js.UndefOr[js.Object | Null] = js.undefined
  var shared_comments: js.UndefOr[Boolean] = js.undefined
  var shared_tickets: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  val url: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    created_at: String,
    id: ZendeskID,
    name: String,
    details: String = null,
    domain_names: js.Array[String] = null,
    external_id: String = null,
    group_id: Int | Double = null,
    notes: String = null,
    organization_fields: js.Object = null,
    shared_comments: js.UndefOr[Boolean] = js.undefined,
    shared_tickets: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null,
    updated_at: String = null,
    url: String = null
  ): Model = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id, name = name)
    if (details != null) __obj.updateDynamic("details")(details)
    if (domain_names != null) __obj.updateDynamic("domain_names")(domain_names)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (organization_fields != null) __obj.updateDynamic("organization_fields")(organization_fields)
    if (!js.isUndefined(shared_comments)) __obj.updateDynamic("shared_comments")(shared_comments)
    if (!js.isUndefined(shared_tickets)) __obj.updateDynamic("shared_tickets")(shared_tickets)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Model]
  }
}

