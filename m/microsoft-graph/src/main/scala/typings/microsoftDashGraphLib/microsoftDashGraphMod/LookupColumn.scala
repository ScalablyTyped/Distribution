package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupColumn extends js.Object {
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleValues: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
  var allowUnlimitedLength: js.UndefOr[scala.Boolean] = js.undefined
  // The name of the lookup source column.
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  // The unique identifier of the lookup source list.
  var listId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the
    * primary lookup. Use the list item looked up by the primary as the source for the column named here.
    */
  var primaryLookupColumnId: js.UndefOr[java.lang.String] = js.undefined
}

object LookupColumn {
  @scala.inline
  def apply(
    allowMultipleValues: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnlimitedLength: js.UndefOr[scala.Boolean] = js.undefined,
    columnName: java.lang.String = null,
    listId: java.lang.String = null,
    primaryLookupColumnId: java.lang.String = null
  ): LookupColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleValues)) __obj.updateDynamic("allowMultipleValues")(allowMultipleValues)
    if (!js.isUndefined(allowUnlimitedLength)) __obj.updateDynamic("allowUnlimitedLength")(allowUnlimitedLength)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (primaryLookupColumnId != null) __obj.updateDynamic("primaryLookupColumnId")(primaryLookupColumnId)
    __obj.asInstanceOf[LookupColumn]
  }
}

