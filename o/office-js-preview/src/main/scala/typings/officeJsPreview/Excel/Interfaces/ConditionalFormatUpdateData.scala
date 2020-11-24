package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalFormat object, for use in `conditionalFormat.set({ ... })`. */
@js.native
trait ConditionalFormatUpdateData extends js.Object {
  
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatUpdateData] = js.native
  
  /**
    *
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than than bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it.
    *
    * [Api set: ExcelApi 1.6]
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    *
    * If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Null on databars, icon sets, and colorscales as there's no concept of StopIfTrue for these
    *
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatUpdateData] = js.native
}
object ConditionalFormatUpdateData {
  
  @scala.inline
  def apply(): ConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalFormatUpdateDataOps[Self <: ConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
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
    def setCellValue(value: CellValueConditionalFormatUpdateData): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    
    @scala.inline
    def setCellValueOrNullObject(value: CellValueConditionalFormatUpdateData): Self = this.set("cellValueOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellValueOrNullObject: Self = this.set("cellValueOrNullObject", js.undefined)
    
    @scala.inline
    def setColorScale(value: ColorScaleConditionalFormatUpdateData): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    
    @scala.inline
    def setColorScaleOrNullObject(value: ColorScaleConditionalFormatUpdateData): Self = this.set("colorScaleOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScaleOrNullObject: Self = this.set("colorScaleOrNullObject", js.undefined)
    
    @scala.inline
    def setCustom(value: CustomConditionalFormatUpdateData): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setCustomOrNullObject(value: CustomConditionalFormatUpdateData): Self = this.set("customOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomOrNullObject: Self = this.set("customOrNullObject", js.undefined)
    
    @scala.inline
    def setDataBar(value: DataBarConditionalFormatUpdateData): Self = this.set("dataBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBar: Self = this.set("dataBar", js.undefined)
    
    @scala.inline
    def setDataBarOrNullObject(value: DataBarConditionalFormatUpdateData): Self = this.set("dataBarOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBarOrNullObject: Self = this.set("dataBarOrNullObject", js.undefined)
    
    @scala.inline
    def setIconSet(value: IconSetConditionalFormatUpdateData): Self = this.set("iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSet: Self = this.set("iconSet", js.undefined)
    
    @scala.inline
    def setIconSetOrNullObject(value: IconSetConditionalFormatUpdateData): Self = this.set("iconSetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSetOrNullObject: Self = this.set("iconSetOrNullObject", js.undefined)
    
    @scala.inline
    def setPreset(value: PresetCriteriaConditionalFormatUpdateData): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setPresetOrNullObject(value: PresetCriteriaConditionalFormatUpdateData): Self = this.set("presetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresetOrNullObject: Self = this.set("presetOrNullObject", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setStopIfTrue(value: Boolean): Self = this.set("stopIfTrue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopIfTrue: Self = this.set("stopIfTrue", js.undefined)
    
    @scala.inline
    def setTextComparison(value: TextConditionalFormatUpdateData): Self = this.set("textComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComparison: Self = this.set("textComparison", js.undefined)
    
    @scala.inline
    def setTextComparisonOrNullObject(value: TextConditionalFormatUpdateData): Self = this.set("textComparisonOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComparisonOrNullObject: Self = this.set("textComparisonOrNullObject", js.undefined)
    
    @scala.inline
    def setTopBottom(value: TopBottomConditionalFormatUpdateData): Self = this.set("topBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBottom: Self = this.set("topBottom", js.undefined)
    
    @scala.inline
    def setTopBottomOrNullObject(value: TopBottomConditionalFormatUpdateData): Self = this.set("topBottomOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBottomOrNullObject: Self = this.set("topBottomOrNullObject", js.undefined)
  }
}
