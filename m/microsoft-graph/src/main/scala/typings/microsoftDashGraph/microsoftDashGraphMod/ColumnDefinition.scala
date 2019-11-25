package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends Entity {
  // This column stores boolean values.
  var boolean: js.UndefOr[BooleanColumn] = js.undefined
  // This column's data is calculated based on other columns.
  var calculated: js.UndefOr[CalculatedColumn] = js.undefined
  // This column stores data from a list of choices.
  var choice: js.UndefOr[ChoiceColumn] = js.undefined
  // For site columns, the name of the group this column belongs to. Helps organize related columns.
  var columnGroup: js.UndefOr[String] = js.undefined
  // This column stores currency values.
  var currency: js.UndefOr[CurrencyColumn] = js.undefined
  // This column stores DateTime values.
  var dateTime: js.UndefOr[DateTimeColumn] = js.undefined
  // The default value for this column.
  var defaultValue: js.UndefOr[DefaultColumnValue] = js.undefined
  // The user-facing description of the column.
  var description: js.UndefOr[String] = js.undefined
  // The user-facing name of the column.
  var displayName: js.UndefOr[String] = js.undefined
  // If true, no two list items may have the same value for this column.
  var enforceUniqueValues: js.UndefOr[Boolean] = js.undefined
  // Specifies whether the column is displayed in the user interface.
  var hidden: js.UndefOr[Boolean] = js.undefined
  // Specifies whether the column values can used for sorting and searching.
  var indexed: js.UndefOr[Boolean] = js.undefined
  // This column's data is looked up from another source in the site.
  var lookup: js.UndefOr[LookupColumn] = js.undefined
  /**
    * The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see
    * displayName.
    */
  var name: js.UndefOr[String] = js.undefined
  // This column stores number values.
  var number: js.UndefOr[NumberColumn] = js.undefined
  // This column stores Person or Group values.
  var personOrGroup: js.UndefOr[PersonOrGroupColumn] = js.undefined
  // Specifies whether the column values can be modified.
  var readOnly: js.UndefOr[Boolean] = js.undefined
  // Specifies whether the column value is not optional.
  var required: js.UndefOr[Boolean] = js.undefined
  // This column stores text values.
  var text: js.UndefOr[TextColumn] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    boolean: BooleanColumn = null,
    calculated: CalculatedColumn = null,
    choice: ChoiceColumn = null,
    columnGroup: String = null,
    currency: CurrencyColumn = null,
    dateTime: DateTimeColumn = null,
    defaultValue: DefaultColumnValue = null,
    description: String = null,
    displayName: String = null,
    enforceUniqueValues: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    lookup: LookupColumn = null,
    name: String = null,
    number: NumberColumn = null,
    personOrGroup: PersonOrGroupColumn = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    text: TextColumn = null
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (calculated != null) __obj.updateDynamic("calculated")(calculated.asInstanceOf[js.Any])
    if (choice != null) __obj.updateDynamic("choice")(choice.asInstanceOf[js.Any])
    if (columnGroup != null) __obj.updateDynamic("columnGroup")(columnGroup.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceUniqueValues)) __obj.updateDynamic("enforceUniqueValues")(enforceUniqueValues.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (personOrGroup != null) __obj.updateDynamic("personOrGroup")(personOrGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

