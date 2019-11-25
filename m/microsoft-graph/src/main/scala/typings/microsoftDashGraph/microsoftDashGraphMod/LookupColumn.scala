package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupColumn extends js.Object {
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleValues: js.UndefOr[Boolean] = js.undefined
  // Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
  var allowUnlimitedLength: js.UndefOr[Boolean] = js.undefined
  // The name of the lookup source column.
  var columnName: js.UndefOr[String] = js.undefined
  // The unique identifier of the lookup source list.
  var listId: js.UndefOr[String] = js.undefined
  /**
    * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the
    * primary lookup. Use the list item looked up by the primary as the source for the column named here.
    */
  var primaryLookupColumnId: js.UndefOr[String] = js.undefined
}

object LookupColumn {
  @scala.inline
  def apply(
    allowMultipleValues: js.UndefOr[Boolean] = js.undefined,
    allowUnlimitedLength: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    listId: String = null,
    primaryLookupColumnId: String = null
  ): LookupColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleValues)) __obj.updateDynamic("allowMultipleValues")(allowMultipleValues.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnlimitedLength)) __obj.updateDynamic("allowUnlimitedLength")(allowUnlimitedLength.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (primaryLookupColumnId != null) __obj.updateDynamic("primaryLookupColumnId")(primaryLookupColumnId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupColumn]
  }
}

