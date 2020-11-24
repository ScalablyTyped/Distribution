package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDefinition extends Entity {
  
  // This column stores boolean values.
  var boolean: js.UndefOr[NullableOption[BooleanColumn]] = js.native
  
  // This column's data is calculated based on other columns.
  var calculated: js.UndefOr[NullableOption[CalculatedColumn]] = js.native
  
  // This column stores data from a list of choices.
  var choice: js.UndefOr[NullableOption[ChoiceColumn]] = js.native
  
  // For site columns, the name of the group this column belongs to. Helps organize related columns.
  var columnGroup: js.UndefOr[NullableOption[String]] = js.native
  
  // This column stores currency values.
  var currency: js.UndefOr[NullableOption[CurrencyColumn]] = js.native
  
  // This column stores DateTime values.
  var dateTime: js.UndefOr[NullableOption[DateTimeColumn]] = js.native
  
  // The default value for this column.
  var defaultValue: js.UndefOr[NullableOption[DefaultColumnValue]] = js.native
  
  // The user-facing description of the column.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The user-facing name of the column.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // If true, no two list items may have the same value for this column.
  var enforceUniqueValues: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // This column stores a geolocation.
  var geolocation: js.UndefOr[NullableOption[GeolocationColumn]] = js.native
  
  // Specifies whether the column is displayed in the user interface.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Specifies whether the column values can used for sorting and searching.
  var indexed: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // This column's data is looked up from another source in the site.
  var lookup: js.UndefOr[NullableOption[LookupColumn]] = js.native
  
  /**
    * The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see
    * displayName.
    */
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // This column stores number values.
  var number: js.UndefOr[NullableOption[NumberColumn]] = js.native
  
  // This column stores Person or Group values.
  var personOrGroup: js.UndefOr[NullableOption[PersonOrGroupColumn]] = js.native
  
  // Specifies whether the column values can be modified.
  var readOnly: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Specifies whether the column value is not optional.
  var required: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // This column stores text values.
  var text: js.UndefOr[NullableOption[TextColumn]] = js.native
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
    def setBoolean(value: NullableOption[BooleanColumn]): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    
    @scala.inline
    def setBooleanNull: Self = this.set("boolean", null)
    
    @scala.inline
    def setCalculated(value: NullableOption[CalculatedColumn]): Self = this.set("calculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculated: Self = this.set("calculated", js.undefined)
    
    @scala.inline
    def setCalculatedNull: Self = this.set("calculated", null)
    
    @scala.inline
    def setChoice(value: NullableOption[ChoiceColumn]): Self = this.set("choice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoice: Self = this.set("choice", js.undefined)
    
    @scala.inline
    def setChoiceNull: Self = this.set("choice", null)
    
    @scala.inline
    def setColumnGroup(value: NullableOption[String]): Self = this.set("columnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroup: Self = this.set("columnGroup", js.undefined)
    
    @scala.inline
    def setColumnGroupNull: Self = this.set("columnGroup", null)
    
    @scala.inline
    def setCurrency(value: NullableOption[CurrencyColumn]): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCurrencyNull: Self = this.set("currency", null)
    
    @scala.inline
    def setDateTime(value: NullableOption[DateTimeColumn]): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    
    @scala.inline
    def setDateTimeNull: Self = this.set("dateTime", null)
    
    @scala.inline
    def setDefaultValue(value: NullableOption[DefaultColumnValue]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEnforceUniqueValues(value: NullableOption[Boolean]): Self = this.set("enforceUniqueValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceUniqueValues: Self = this.set("enforceUniqueValues", js.undefined)
    
    @scala.inline
    def setEnforceUniqueValuesNull: Self = this.set("enforceUniqueValues", null)
    
    @scala.inline
    def setGeolocation(value: NullableOption[GeolocationColumn]): Self = this.set("geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeolocation: Self = this.set("geolocation", js.undefined)
    
    @scala.inline
    def setGeolocationNull: Self = this.set("geolocation", null)
    
    @scala.inline
    def setHidden(value: NullableOption[Boolean]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiddenNull: Self = this.set("hidden", null)
    
    @scala.inline
    def setIndexed(value: NullableOption[Boolean]): Self = this.set("indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    
    @scala.inline
    def setIndexedNull: Self = this.set("indexed", null)
    
    @scala.inline
    def setLookup(value: NullableOption[LookupColumn]): Self = this.set("lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setLookupNull: Self = this.set("lookup", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setNumber(value: NullableOption[NumberColumn]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setNumberNull: Self = this.set("number", null)
    
    @scala.inline
    def setPersonOrGroup(value: NullableOption[PersonOrGroupColumn]): Self = this.set("personOrGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonOrGroup: Self = this.set("personOrGroup", js.undefined)
    
    @scala.inline
    def setPersonOrGroupNull: Self = this.set("personOrGroup", null)
    
    @scala.inline
    def setReadOnly(value: NullableOption[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReadOnlyNull: Self = this.set("readOnly", null)
    
    @scala.inline
    def setRequired(value: NullableOption[Boolean]): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setRequiredNull: Self = this.set("required", null)
    
    @scala.inline
    def setText(value: NullableOption[TextColumn]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
}
