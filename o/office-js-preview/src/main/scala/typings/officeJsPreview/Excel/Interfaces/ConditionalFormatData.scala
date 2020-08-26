package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalFormatType
import typings.officeJsPreview.officeJsPreviewStrings.CellValue
import typings.officeJsPreview.officeJsPreviewStrings.ColorScale
import typings.officeJsPreview.officeJsPreviewStrings.ContainsText
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import typings.officeJsPreview.officeJsPreviewStrings.DataBar
import typings.officeJsPreview.officeJsPreviewStrings.IconSet
import typings.officeJsPreview.officeJsPreviewStrings.PresetCriteria
import typings.officeJsPreview.officeJsPreviewStrings.TopBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalFormat.toJSON()`. */
@js.native
trait ConditionalFormatData extends js.Object {
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatData] = js.native
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatData] = js.native
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatData] = js.native
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatData] = js.native
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatData] = js.native
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatData] = js.native
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatData] = js.native
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatData] = js.native
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatData] = js.native
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatData] = js.native
  /**
    *
    * The Priority of the Conditional Format within the current ConditionalFormatCollection.
    *
    * [Api set: ExcelApi 1.6]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatData] = js.native
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatData] = js.native
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
  var textComparison: js.UndefOr[TextConditionalFormatData] = js.native
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatData] = js.native
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatData] = js.native
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatData] = js.native
  /**
    *
    * A type of conditional format. Only one can be set at a time.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: js.UndefOr[
    ConditionalFormatType | Custom | DataBar | ColorScale | IconSet | TopBottom | PresetCriteria | ContainsText | CellValue
  ] = js.native
}

object ConditionalFormatData {
  @scala.inline
  def apply(): ConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatData]
  }
  @scala.inline
  implicit class ConditionalFormatDataOps[Self <: ConditionalFormatData] (val x: Self) extends AnyVal {
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
    def setCellValue(value: CellValueConditionalFormatData): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    @scala.inline
    def setCellValueOrNullObject(value: CellValueConditionalFormatData): Self = this.set("cellValueOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellValueOrNullObject: Self = this.set("cellValueOrNullObject", js.undefined)
    @scala.inline
    def setColorScale(value: ColorScaleConditionalFormatData): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    @scala.inline
    def setColorScaleOrNullObject(value: ColorScaleConditionalFormatData): Self = this.set("colorScaleOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorScaleOrNullObject: Self = this.set("colorScaleOrNullObject", js.undefined)
    @scala.inline
    def setCustom(value: CustomConditionalFormatData): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setCustomOrNullObject(value: CustomConditionalFormatData): Self = this.set("customOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomOrNullObject: Self = this.set("customOrNullObject", js.undefined)
    @scala.inline
    def setDataBar(value: DataBarConditionalFormatData): Self = this.set("dataBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBar: Self = this.set("dataBar", js.undefined)
    @scala.inline
    def setDataBarOrNullObject(value: DataBarConditionalFormatData): Self = this.set("dataBarOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBarOrNullObject: Self = this.set("dataBarOrNullObject", js.undefined)
    @scala.inline
    def setIconSet(value: IconSetConditionalFormatData): Self = this.set("iconSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSet: Self = this.set("iconSet", js.undefined)
    @scala.inline
    def setIconSetOrNullObject(value: IconSetConditionalFormatData): Self = this.set("iconSetOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSetOrNullObject: Self = this.set("iconSetOrNullObject", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPreset(value: PresetCriteriaConditionalFormatData): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setPresetOrNullObject(value: PresetCriteriaConditionalFormatData): Self = this.set("presetOrNullObject", value.asInstanceOf[js.Any])
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
    def setTextComparison(value: TextConditionalFormatData): Self = this.set("textComparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextComparison: Self = this.set("textComparison", js.undefined)
    @scala.inline
    def setTextComparisonOrNullObject(value: TextConditionalFormatData): Self = this.set("textComparisonOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextComparisonOrNullObject: Self = this.set("textComparisonOrNullObject", js.undefined)
    @scala.inline
    def setTopBottom(value: TopBottomConditionalFormatData): Self = this.set("topBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopBottom: Self = this.set("topBottom", js.undefined)
    @scala.inline
    def setTopBottomOrNullObject(value: TopBottomConditionalFormatData): Self = this.set("topBottomOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopBottomOrNullObject: Self = this.set("topBottomOrNullObject", js.undefined)
    @scala.inline
    def setType(
      value: ConditionalFormatType | Custom | DataBar | ColorScale | IconSet | TopBottom | PresetCriteria | ContainsText | CellValue
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

