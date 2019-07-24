package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentType extends Entity {
  // The collection of columns that are required by this content type
  var columnLinks: js.UndefOr[js.Array[ColumnLink]] = js.undefined
  // The descriptive text for the item.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // The name of the group this content type belongs to. Helps organize related content types.
  var group: js.UndefOr[java.lang.String] = js.undefined
  // Indicates whether the content type is hidden in the list's 'New' menu.
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this content type is inherited from another scope (like a site), provides a reference to the item where the content
    * type is defined.
    */
  var inheritedFrom: js.UndefOr[ItemReference] = js.undefined
  // The name of the content type.
  var name: js.UndefOr[java.lang.String] = js.undefined
  // Specifies the order in which the content type appears in the selection UI.
  var order: js.UndefOr[ContentTypeOrder] = js.undefined
  // The unique identifier of the content type.
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  // If true, the content type cannot be modified unless this value is first set to false.
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the content type cannot be modified by users or through push-down operations. Only site collection
    * administrators can seal or unseal content types.
    */
  var `sealed`: js.UndefOr[scala.Boolean] = js.undefined
}

object ContentType {
  @scala.inline
  def apply(
    columnLinks: js.Array[ColumnLink] = null,
    description: java.lang.String = null,
    group: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inheritedFrom: ItemReference = null,
    name: java.lang.String = null,
    order: ContentTypeOrder = null,
    parentId: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    `sealed`: js.UndefOr[scala.Boolean] = js.undefined
  ): ContentType = {
    val __obj = js.Dynamic.literal()
    if (columnLinks != null) __obj.updateDynamic("columnLinks")(columnLinks)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom)
    if (name != null) __obj.updateDynamic("name")(name)
    if (order != null) __obj.updateDynamic("order")(order)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(`sealed`)) __obj.updateDynamic("sealed")(`sealed`)
    __obj.asInstanceOf[ContentType]
  }
}

