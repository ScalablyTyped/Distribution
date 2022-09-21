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
  
  // This column stores content approval status.
  var contentApprovalStatus: js.UndefOr[NullableOption[ContentApprovalStatusColumn]] = js.undefined
  
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
  
  // This column stores hyperlink or picture values.
  var hyperlinkOrPicture: js.UndefOr[NullableOption[HyperlinkOrPictureColumn]] = js.undefined
  
  // Specifies whether the column values can be used for sorting and searching.
  var indexed: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether this column can be deleted.
  var isDeletable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether values in the column can be reordered. Read-only.
  var isReorderable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the column can be changed.
  var isSealed: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
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
  
  // If 'true', changes to this column will be propagated to lists that implement the column.
  var propagateChanges: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the column values can be modified.
  var readOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the column value isn't optional.
  var required: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The source column for the content type column.
  var sourceColumn: js.UndefOr[NullableOption[ColumnDefinition]] = js.undefined
  
  // ContentType from which this column is inherited from. Present only in contentTypes columns response. Read-only.
  var sourceContentType: js.UndefOr[NullableOption[ContentTypeInfo]] = js.undefined
  
  // This column stores taxonomy terms.
  var term: js.UndefOr[NullableOption[TermColumn]] = js.undefined
  
  // This column stores text values.
  var text: js.UndefOr[NullableOption[TextColumn]] = js.undefined
  
  // This column stores thumbnail values.
  var thumbnail: js.UndefOr[NullableOption[ThumbnailColumn]] = js.undefined
  
  // For site columns, the type of column. Read-only.
  var `type`: js.UndefOr[NullableOption[ColumnTypes]] = js.undefined
  
  // This column stores validation formula and message for the column.
  var validation: js.UndefOr[NullableOption[ColumnValidation]] = js.undefined
}
object ColumnDefinition {
  
  inline def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  extension [Self <: ColumnDefinition](x: Self) {
    
    inline def setBoolean(value: NullableOption[BooleanColumn]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setBooleanNull: Self = StObject.set(x, "boolean", null)
    
    inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    inline def setCalculated(value: NullableOption[CalculatedColumn]): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
    
    inline def setCalculatedNull: Self = StObject.set(x, "calculated", null)
    
    inline def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    
    inline def setChoice(value: NullableOption[ChoiceColumn]): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceNull: Self = StObject.set(x, "choice", null)
    
    inline def setChoiceUndefined: Self = StObject.set(x, "choice", js.undefined)
    
    inline def setColumnGroup(value: NullableOption[String]): Self = StObject.set(x, "columnGroup", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupNull: Self = StObject.set(x, "columnGroup", null)
    
    inline def setColumnGroupUndefined: Self = StObject.set(x, "columnGroup", js.undefined)
    
    inline def setContentApprovalStatus(value: NullableOption[ContentApprovalStatusColumn]): Self = StObject.set(x, "contentApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setContentApprovalStatusNull: Self = StObject.set(x, "contentApprovalStatus", null)
    
    inline def setContentApprovalStatusUndefined: Self = StObject.set(x, "contentApprovalStatus", js.undefined)
    
    inline def setCurrency(value: NullableOption[CurrencyColumn]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDateTime(value: NullableOption[DateTimeColumn]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeNull: Self = StObject.set(x, "dateTime", null)
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setDefaultValue(value: NullableOption[DefaultColumnValue]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnforceUniqueValues(value: NullableOption[Boolean]): Self = StObject.set(x, "enforceUniqueValues", value.asInstanceOf[js.Any])
    
    inline def setEnforceUniqueValuesNull: Self = StObject.set(x, "enforceUniqueValues", null)
    
    inline def setEnforceUniqueValuesUndefined: Self = StObject.set(x, "enforceUniqueValues", js.undefined)
    
    inline def setGeolocation(value: NullableOption[GeolocationColumn]): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    inline def setGeolocationNull: Self = StObject.set(x, "geolocation", null)
    
    inline def setGeolocationUndefined: Self = StObject.set(x, "geolocation", js.undefined)
    
    inline def setHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHyperlinkOrPicture(value: NullableOption[HyperlinkOrPictureColumn]): Self = StObject.set(x, "hyperlinkOrPicture", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkOrPictureNull: Self = StObject.set(x, "hyperlinkOrPicture", null)
    
    inline def setHyperlinkOrPictureUndefined: Self = StObject.set(x, "hyperlinkOrPicture", js.undefined)
    
    inline def setIndexed(value: NullableOption[Boolean]): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    inline def setIndexedNull: Self = StObject.set(x, "indexed", null)
    
    inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    inline def setIsDeletable(value: NullableOption[Boolean]): Self = StObject.set(x, "isDeletable", value.asInstanceOf[js.Any])
    
    inline def setIsDeletableNull: Self = StObject.set(x, "isDeletable", null)
    
    inline def setIsDeletableUndefined: Self = StObject.set(x, "isDeletable", js.undefined)
    
    inline def setIsReorderable(value: NullableOption[Boolean]): Self = StObject.set(x, "isReorderable", value.asInstanceOf[js.Any])
    
    inline def setIsReorderableNull: Self = StObject.set(x, "isReorderable", null)
    
    inline def setIsReorderableUndefined: Self = StObject.set(x, "isReorderable", js.undefined)
    
    inline def setIsSealed(value: NullableOption[Boolean]): Self = StObject.set(x, "isSealed", value.asInstanceOf[js.Any])
    
    inline def setIsSealedNull: Self = StObject.set(x, "isSealed", null)
    
    inline def setIsSealedUndefined: Self = StObject.set(x, "isSealed", js.undefined)
    
    inline def setLookup(value: NullableOption[LookupColumn]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setLookupNull: Self = StObject.set(x, "lookup", null)
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: NullableOption[NumberColumn]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPersonOrGroup(value: NullableOption[PersonOrGroupColumn]): Self = StObject.set(x, "personOrGroup", value.asInstanceOf[js.Any])
    
    inline def setPersonOrGroupNull: Self = StObject.set(x, "personOrGroup", null)
    
    inline def setPersonOrGroupUndefined: Self = StObject.set(x, "personOrGroup", js.undefined)
    
    inline def setPropagateChanges(value: NullableOption[Boolean]): Self = StObject.set(x, "propagateChanges", value.asInstanceOf[js.Any])
    
    inline def setPropagateChangesNull: Self = StObject.set(x, "propagateChanges", null)
    
    inline def setPropagateChangesUndefined: Self = StObject.set(x, "propagateChanges", js.undefined)
    
    inline def setReadOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSourceColumn(value: NullableOption[ColumnDefinition]): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceColumnNull: Self = StObject.set(x, "sourceColumn", null)
    
    inline def setSourceColumnUndefined: Self = StObject.set(x, "sourceColumn", js.undefined)
    
    inline def setSourceContentType(value: NullableOption[ContentTypeInfo]): Self = StObject.set(x, "sourceContentType", value.asInstanceOf[js.Any])
    
    inline def setSourceContentTypeNull: Self = StObject.set(x, "sourceContentType", null)
    
    inline def setSourceContentTypeUndefined: Self = StObject.set(x, "sourceContentType", js.undefined)
    
    inline def setTerm(value: NullableOption[TermColumn]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermNull: Self = StObject.set(x, "term", null)
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setText(value: NullableOption[TextColumn]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThumbnail(value: NullableOption[ThumbnailColumn]): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailNull: Self = StObject.set(x, "thumbnail", null)
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setType(value: NullableOption[ColumnTypes]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidation(value: NullableOption[ColumnValidation]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationNull: Self = StObject.set(x, "validation", null)
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
