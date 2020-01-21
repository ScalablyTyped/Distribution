package typings.nodeZendesk.mod.Organizations

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
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
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (domain_names != null) __obj.updateDynamic("domain_names")(domain_names.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (organization_fields != null) __obj.updateDynamic("organization_fields")(organization_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(shared_comments)) __obj.updateDynamic("shared_comments")(shared_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(shared_tickets)) __obj.updateDynamic("shared_tickets")(shared_tickets.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

