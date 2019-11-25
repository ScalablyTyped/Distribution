package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentType extends Entity {
  // The collection of columns that are required by this content type
  var columnLinks: js.UndefOr[js.Array[ColumnLink]] = js.undefined
  // The descriptive text for the item.
  var description: js.UndefOr[String] = js.undefined
  // The name of the group this content type belongs to. Helps organize related content types.
  var group: js.UndefOr[String] = js.undefined
  // Indicates whether the content type is hidden in the list's 'New' menu.
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * If this content type is inherited from another scope (like a site), provides a reference to the item where the content
    * type is defined.
    */
  var inheritedFrom: js.UndefOr[ItemReference] = js.undefined
  // The name of the content type.
  var name: js.UndefOr[String] = js.undefined
  // Specifies the order in which the content type appears in the selection UI.
  var order: js.UndefOr[ContentTypeOrder] = js.undefined
  // The unique identifier of the content type.
  var parentId: js.UndefOr[String] = js.undefined
  // If true, the content type cannot be modified unless this value is first set to false.
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the content type cannot be modified by users or through push-down operations. Only site collection
    * administrators can seal or unseal content types.
    */
  var `sealed`: js.UndefOr[Boolean] = js.undefined
}

object ContentType {
  @scala.inline
  def apply(
    columnLinks: js.Array[ColumnLink] = null,
    description: String = null,
    group: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inheritedFrom: ItemReference = null,
    name: String = null,
    order: ContentTypeOrder = null,
    parentId: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    `sealed`: js.UndefOr[Boolean] = js.undefined
  ): ContentType = {
    val __obj = js.Dynamic.literal()
    if (columnLinks != null) __obj.updateDynamic("columnLinks")(columnLinks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(`sealed`)) __obj.updateDynamic("sealed")(`sealed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
}

