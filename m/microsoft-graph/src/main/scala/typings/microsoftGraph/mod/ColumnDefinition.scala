package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinition extends Entity {
  // This column stores boolean values.
  var boolean: js.UndefOr[BooleanColumn] = js.native
  // This column's data is calculated based on other columns.
  var calculated: js.UndefOr[CalculatedColumn] = js.native
  // This column stores data from a list of choices.
  var choice: js.UndefOr[ChoiceColumn] = js.native
  // For site columns, the name of the group this column belongs to. Helps organize related columns.
  var columnGroup: js.UndefOr[String] = js.native
  // This column stores currency values.
  var currency: js.UndefOr[CurrencyColumn] = js.native
  // This column stores DateTime values.
  var dateTime: js.UndefOr[DateTimeColumn] = js.native
  // The default value for this column.
  var defaultValue: js.UndefOr[DefaultColumnValue] = js.native
  // The user-facing description of the column.
  var description: js.UndefOr[String] = js.native
  // The user-facing name of the column.
  var displayName: js.UndefOr[String] = js.native
  // If true, no two list items may have the same value for this column.
  var enforceUniqueValues: js.UndefOr[Boolean] = js.native
  // This column stores a geolocation.
  var geolocation: js.UndefOr[GeolocationColumn] = js.native
  // Specifies whether the column is displayed in the user interface.
  var hidden: js.UndefOr[Boolean] = js.native
  // Specifies whether the column values can used for sorting and searching.
  var indexed: js.UndefOr[Boolean] = js.native
  // This column's data is looked up from another source in the site.
  var lookup: js.UndefOr[LookupColumn] = js.native
  /**
    * The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see
    * displayName.
    */
  var name: js.UndefOr[String] = js.native
  // This column stores number values.
  var number: js.UndefOr[NumberColumn] = js.native
  // This column stores Person or Group values.
  var personOrGroup: js.UndefOr[PersonOrGroupColumn] = js.native
  // Specifies whether the column values can be modified.
  var readOnly: js.UndefOr[Boolean] = js.native
  // Specifies whether the column value is not optional.
  var required: js.UndefOr[Boolean] = js.native
  // This column stores text values.
  var text: js.UndefOr[TextColumn] = js.native
}

object ColumnDefinition {
  @scala.inline
  def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoolean(value: BooleanColumn): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setCalculated(value: CalculatedColumn): Self = this.set("calculated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculated: Self = this.set("calculated", js.undefined)
    @scala.inline
    def setChoice(value: ChoiceColumn): Self = this.set("choice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoice: Self = this.set("choice", js.undefined)
    @scala.inline
    def setColumnGroup(value: String): Self = this.set("columnGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGroup: Self = this.set("columnGroup", js.undefined)
    @scala.inline
    def setCurrency(value: CurrencyColumn): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDateTime(value: DateTimeColumn): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setDefaultValue(value: DefaultColumnValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEnforceUniqueValues(value: Boolean): Self = this.set("enforceUniqueValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceUniqueValues: Self = this.set("enforceUniqueValues", js.undefined)
    @scala.inline
    def setGeolocation(value: GeolocationColumn): Self = this.set("geolocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeolocation: Self = this.set("geolocation", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIndexed(value: Boolean): Self = this.set("indexed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    @scala.inline
    def setLookup(value: LookupColumn): Self = this.set("lookup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumber(value: NumberColumn): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setPersonOrGroup(value: PersonOrGroupColumn): Self = this.set("personOrGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonOrGroup: Self = this.set("personOrGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setText(value: TextColumn): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

