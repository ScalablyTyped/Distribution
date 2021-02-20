package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the conditional formats that are overlap the range.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalFormatCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The Priority of the Conditional Format within the current ConditionalFormatCollection.
    *
    * [Api set: ExcelApi 1.6]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than than bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it.
    *
    * [Api set: ExcelApi 1.6]
    */
  var priority: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Null on databars, icon sets, and colorscales as there's no concept of StopIfTrue for these
    *
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: A type of conditional format. Only one can be set at a time.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}
object ConditionalFormatCollectionLoadOptions {
  
  @scala.inline
  def apply(): ConditionalFormatCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class ConditionalFormatCollectionLoadOptionsMutableBuilder[Self <: ConditionalFormatCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setCellValue(value: CellValueConditionalFormatLoadOptions): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellValueOrNullObject(value: CellValueConditionalFormatLoadOptions): Self = StObject.set(x, "cellValueOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellValueOrNullObjectUndefined: Self = StObject.set(x, "cellValueOrNullObject", js.undefined)
    
    @scala.inline
    def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
    
    @scala.inline
    def setColorScale(value: ColorScaleConditionalFormatLoadOptions): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleOrNullObject(value: ColorScaleConditionalFormatLoadOptions): Self = StObject.set(x, "colorScaleOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleOrNullObjectUndefined: Self = StObject.set(x, "colorScaleOrNullObject", js.undefined)
    
    @scala.inline
    def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    @scala.inline
    def setCustom(value: CustomConditionalFormatLoadOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOrNullObject(value: CustomConditionalFormatLoadOptions): Self = StObject.set(x, "customOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOrNullObjectUndefined: Self = StObject.set(x, "customOrNullObject", js.undefined)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDataBar(value: DataBarConditionalFormatLoadOptions): Self = StObject.set(x, "dataBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBarOrNullObject(value: DataBarConditionalFormatLoadOptions): Self = StObject.set(x, "dataBarOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBarOrNullObjectUndefined: Self = StObject.set(x, "dataBarOrNullObject", js.undefined)
    
    @scala.inline
    def setDataBarUndefined: Self = StObject.set(x, "dataBar", js.undefined)
    
    @scala.inline
    def setIconSet(value: IconSetConditionalFormatLoadOptions): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSetOrNullObject(value: IconSetConditionalFormatLoadOptions): Self = StObject.set(x, "iconSetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSetOrNullObjectUndefined: Self = StObject.set(x, "iconSetOrNullObject", js.undefined)
    
    @scala.inline
    def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPreset(value: PresetCriteriaConditionalFormatLoadOptions): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetOrNullObject(value: PresetCriteriaConditionalFormatLoadOptions): Self = StObject.set(x, "presetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetOrNullObjectUndefined: Self = StObject.set(x, "presetOrNullObject", js.undefined)
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    @scala.inline
    def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setStopIfTrue(value: Boolean): Self = StObject.set(x, "stopIfTrue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIfTrueUndefined: Self = StObject.set(x, "stopIfTrue", js.undefined)
    
    @scala.inline
    def setTextComparison(value: TextConditionalFormatLoadOptions): Self = StObject.set(x, "textComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextComparisonOrNullObject(value: TextConditionalFormatLoadOptions): Self = StObject.set(x, "textComparisonOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextComparisonOrNullObjectUndefined: Self = StObject.set(x, "textComparisonOrNullObject", js.undefined)
    
    @scala.inline
    def setTextComparisonUndefined: Self = StObject.set(x, "textComparison", js.undefined)
    
    @scala.inline
    def setTopBottom(value: TopBottomConditionalFormatLoadOptions): Self = StObject.set(x, "topBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBottomOrNullObject(value: TopBottomConditionalFormatLoadOptions): Self = StObject.set(x, "topBottomOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBottomOrNullObjectUndefined: Self = StObject.set(x, "topBottomOrNullObject", js.undefined)
    
    @scala.inline
    def setTopBottomUndefined: Self = StObject.set(x, "topBottom", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
