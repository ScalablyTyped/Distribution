package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends Entity {
  /** This column stores boolean values. */
  var boolean: js.UndefOr[BooleanColumn] = js.undefined
  /** This column's data is calculated based on other columns. */
  var calculated: js.UndefOr[CalculatedColumn] = js.undefined
  /** This column stores data from a list of choices. */
  var choice: js.UndefOr[ChoiceColumn] = js.undefined
  /** For site columns, the name of the group this column belongs to. Helps organize related columns. */
  var columnGroup: js.UndefOr[java.lang.String] = js.undefined
  /** This column stores currency values. */
  var currency: js.UndefOr[CurrencyColumn] = js.undefined
  /** This column stores DateTime values. */
  var dateTime: js.UndefOr[DateTimeColumn] = js.undefined
  /** The default value for this column. */
  var defaultValue: js.UndefOr[DefaultColumnValue] = js.undefined
  /** The user-facing description of the column. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The user-facing name of the column. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** If true, no two list items may have the same value for this column. */
  var enforceUniqueValues: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the column is displayed in the user interface. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the column values can used for sorting and searching. */
  var indexed: js.UndefOr[scala.Boolean] = js.undefined
  /** This column's data is looked up from another source in the site. */
  var lookup: js.UndefOr[LookupColumn] = js.undefined
  /** The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** This column stores number values. */
  var number: js.UndefOr[NumberColumn] = js.undefined
  /** This column stores Person or Group values. */
  var personOrGroup: js.UndefOr[PersonOrGroupColumn] = js.undefined
  /** Specifies whether the column values can be modified. */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the column value is not optional. */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /** This column stores text values. */
  var text: js.UndefOr[TextColumn] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    boolean: BooleanColumn = null,
    calculated: CalculatedColumn = null,
    choice: ChoiceColumn = null,
    columnGroup: java.lang.String = null,
    currency: CurrencyColumn = null,
    dateTime: DateTimeColumn = null,
    defaultValue: DefaultColumnValue = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    enforceUniqueValues: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    indexed: js.UndefOr[scala.Boolean] = js.undefined,
    lookup: LookupColumn = null,
    name: java.lang.String = null,
    number: NumberColumn = null,
    personOrGroup: PersonOrGroupColumn = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    text: TextColumn = null
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (boolean != null) __obj.updateDynamic("boolean")(boolean)
    if (calculated != null) __obj.updateDynamic("calculated")(calculated)
    if (choice != null) __obj.updateDynamic("choice")(choice)
    if (columnGroup != null) __obj.updateDynamic("columnGroup")(columnGroup)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enforceUniqueValues)) __obj.updateDynamic("enforceUniqueValues")(enforceUniqueValues)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number)
    if (personOrGroup != null) __obj.updateDynamic("personOrGroup")(personOrGroup)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ColumnDefinition]
  }
}

