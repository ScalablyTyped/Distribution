package typings
package nodeDashZendeskLib.nodeDashZendeskMod.OrganizationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model
  extends nodeDashZendeskLib.nodeDashZendeskMod.AuditableModel {
  var details: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var domain_names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var external_id: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var group_id: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var name: java.lang.String
  var notes: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var organization_fields: js.UndefOr[js.Object | scala.Null] = js.undefined
  var shared_comments: js.UndefOr[scala.Boolean] = js.undefined
  var shared_tickets: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val url: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    name: java.lang.String,
    details: java.lang.String = null,
    domain_names: js.Array[java.lang.String] = null,
    external_id: java.lang.String = null,
    group_id: scala.Int | scala.Double = null,
    notes: java.lang.String = null,
    organization_fields: js.Object = null,
    shared_comments: js.UndefOr[scala.Boolean] = js.undefined,
    shared_tickets: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.Array[java.lang.String] = null,
    updated_at: java.lang.String = null,
    url: java.lang.String = null
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

