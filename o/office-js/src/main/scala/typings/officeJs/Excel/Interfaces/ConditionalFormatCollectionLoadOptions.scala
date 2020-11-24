package typings.officeJs.Excel.Interfaces

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
trait ConditionalFormatCollectionLoadOptions extends js.Object {
  
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
  implicit class ConditionalFormatCollectionLoadOptionsOps[Self <: ConditionalFormatCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setCellValue(value: CellValueConditionalFormatLoadOptions): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    
    @scala.inline
    def setCellValueOrNullObject(value: CellValueConditionalFormatLoadOptions): Self = this.set("cellValueOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellValueOrNullObject: Self = this.set("cellValueOrNullObject", js.undefined)
    
    @scala.inline
    def setColorScale(value: ColorScaleConditionalFormatLoadOptions): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    
    @scala.inline
    def setColorScaleOrNullObject(value: ColorScaleConditionalFormatLoadOptions): Self = this.set("colorScaleOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScaleOrNullObject: Self = this.set("colorScaleOrNullObject", js.undefined)
    
    @scala.inline
    def setCustom(value: CustomConditionalFormatLoadOptions): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setCustomOrNullObject(value: CustomConditionalFormatLoadOptions): Self = this.set("customOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomOrNullObject: Self = this.set("customOrNullObject", js.undefined)
    
    @scala.inline
    def setDataBar(value: DataBarConditionalFormatLoadOptions): Self = this.set("dataBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBar: Self = this.set("dataBar", js.undefined)
    
    @scala.inline
    def setDataBarOrNullObject(value: DataBarConditionalFormatLoadOptions): Self = this.set("dataBarOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBarOrNullObject: Self = this.set("dataBarOrNullObject", js.undefined)
    
    @scala.inline
    def setIconSet(value: IconSetConditionalFormatLoadOptions): Self = this.set("iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSet: Self = this.set("iconSet", js.undefined)
    
    @scala.inline
    def setIconSetOrNullObject(value: IconSetConditionalFormatLoadOptions): Self = this.set("iconSetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSetOrNullObject: Self = this.set("iconSetOrNullObject", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPreset(value: PresetCriteriaConditionalFormatLoadOptions): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setPresetOrNullObject(value: PresetCriteriaConditionalFormatLoadOptions): Self = this.set("presetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresetOrNullObject: Self = this.set("presetOrNullObject", js.undefined)
    
    @scala.inline
    def setPriority(value: Boolean): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setStopIfTrue(value: Boolean): Self = this.set("stopIfTrue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopIfTrue: Self = this.set("stopIfTrue", js.undefined)
    
    @scala.inline
    def setTextComparison(value: TextConditionalFormatLoadOptions): Self = this.set("textComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComparison: Self = this.set("textComparison", js.undefined)
    
    @scala.inline
    def setTextComparisonOrNullObject(value: TextConditionalFormatLoadOptions): Self = this.set("textComparisonOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComparisonOrNullObject: Self = this.set("textComparisonOrNullObject", js.undefined)
    
    @scala.inline
    def setTopBottom(value: TopBottomConditionalFormatLoadOptions): Self = this.set("topBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBottom: Self = this.set("topBottom", js.undefined)
    
    @scala.inline
    def setTopBottomOrNullObject(value: TopBottomConditionalFormatLoadOptions): Self = this.set("topBottomOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBottomOrNullObject: Self = this.set("topBottomOrNullObject", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
