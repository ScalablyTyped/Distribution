package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinition
  extends StObject
     with Entity {
  
  // This column stores boolean values.
  var boolean: js.UndefOr[NullableOption[BooleanColumn]] = js.undefined
  
  // This column's data is calculated based on other columns.
  var calculated: js.UndefOr[NullableOption[CalculatedColumn]] = js.undefined
  
  // This column stores data from a list of choices.
  var choice: js.UndefOr[NullableOption[ChoiceColumn]] = js.undefined
  
  // For site columns, the name of the group this column belongs to. Helps organize related columns.
  var columnGroup: js.UndefOr[NullableOption[String]] = js.undefined
  
  // This column stores currency values.
  var currency: js.UndefOr[NullableOption[CurrencyColumn]] = js.undefined
  
  // This column stores DateTime values.
  var dateTime: js.UndefOr[NullableOption[DateTimeColumn]] = js.undefined
  
  // The default value for this column.
  var defaultValue: js.UndefOr[NullableOption[DefaultColumnValue]] = js.undefined
  
  // The user-facing description of the column.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user-facing name of the column.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If true, no two list items may have the same value for this column.
  var enforceUniqueValues: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // This column stores a geolocation.
  var geolocation: js.UndefOr[NullableOption[GeolocationColumn]] = js.undefined
  
  // Specifies whether the column is displayed in the user interface.
  var hidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the column values can used for sorting and searching.
  var indexed: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // This column's data is looked up from another source in the site.
  var lookup: js.UndefOr[NullableOption[LookupColumn]] = js.undefined
  
  /**
    * The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see
    * displayName.
    */
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // This column stores number values.
  var number: js.UndefOr[NullableOption[NumberColumn]] = js.undefined
  
  // This column stores Person or Group values.
  var personOrGroup: js.UndefOr[NullableOption[PersonOrGroupColumn]] = js.undefined
  
  // Specifies whether the column values can be modified.
  var readOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the column value is not optional.
  var required: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // This column stores text values.
  var text: js.UndefOr[NullableOption[TextColumn]] = js.undefined
}
object ColumnDefinition {
  
  @scala.inline
  def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  @scala.inline
  implicit class ColumnDefinitionMutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: NullableOption[BooleanColumn]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanNull: Self = StObject.set(x, "boolean", null)
    
    @scala.inline
    def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    @scala.inline
    def setCalculated(value: NullableOption[CalculatedColumn]): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedNull: Self = StObject.set(x, "calculated", null)
    
    @scala.inline
    def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    
    @scala.inline
    def setChoice(value: NullableOption[ChoiceColumn]): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoiceNull: Self = StObject.set(x, "choice", null)
    
    @scala.inline
    def setChoiceUndefined: Self = StObject.set(x, "choice", js.undefined)
    
    @scala.inline
    def setColumnGroup(value: NullableOption[String]): Self = StObject.set(x, "columnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupNull: Self = StObject.set(x, "columnGroup", null)
    
    @scala.inline
    def setColumnGroupUndefined: Self = StObject.set(x, "columnGroup", js.undefined)
    
    @scala.inline
    def setCurrency(value: NullableOption[CurrencyColumn]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDateTime(value: NullableOption[DateTimeColumn]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeNull: Self = StObject.set(x, "dateTime", null)
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: NullableOption[DefaultColumnValue]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnforceUniqueValues(value: NullableOption[Boolean]): Self = StObject.set(x, "enforceUniqueValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceUniqueValuesNull: Self = StObject.set(x, "enforceUniqueValues", null)
    
    @scala.inline
    def setEnforceUniqueValuesUndefined: Self = StObject.set(x, "enforceUniqueValues", js.undefined)
    
    @scala.inline
    def setGeolocation(value: NullableOption[GeolocationColumn]): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeolocationNull: Self = StObject.set(x, "geolocation", null)
    
    @scala.inline
    def setGeolocationUndefined: Self = StObject.set(x, "geolocation", js.undefined)
    
    @scala.inline
    def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIndexed(value: NullableOption[Boolean]): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedNull: Self = StObject.set(x, "indexed", null)
    
    @scala.inline
    def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    @scala.inline
    def setLookup(value: NullableOption[LookupColumn]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupNull: Self = StObject.set(x, "lookup", null)
    
    @scala.inline
    def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: NullableOption[NumberColumn]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberNull: Self = StObject.set(x, "number", null)
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPersonOrGroup(value: NullableOption[PersonOrGroupColumn]): Self = StObject.set(x, "personOrGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonOrGroupNull: Self = StObject.set(x, "personOrGroup", null)
    
    @scala.inline
    def setPersonOrGroupUndefined: Self = StObject.set(x, "personOrGroup", js.undefined)
    
    @scala.inline
    def setReadOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredNull: Self = StObject.set(x, "required", null)
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setText(value: NullableOption[TextColumn]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
