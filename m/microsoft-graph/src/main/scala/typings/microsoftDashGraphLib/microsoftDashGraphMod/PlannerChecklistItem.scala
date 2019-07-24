package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerChecklistItem extends js.Object {
  // Value is true if the item is checked and false otherwise.
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Used to set the relative order of items in the checklist. The format is defined as outlined here.
  var orderHint: js.UndefOr[java.lang.String] = js.undefined
  // Title of the checklist item
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerChecklistItem {
  @scala.inline
  def apply(
    isChecked: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    orderHint: java.lang.String = null,
    title: java.lang.String = null
  ): PlannerChecklistItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlannerChecklistItem]
  }
}

