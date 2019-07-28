package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalFormat object, for use in "conditionalFormat.set({ ... })". */
trait ConditionalFormatUpdateData extends js.Object {
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatUpdateData] = js.undefined
  /**
    *
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than than bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    *
    * If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Null on databars, icon sets, and colorscales as there's no concept of StopIfTrue for these
    *
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatUpdateData] = js.undefined
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatUpdateData] = js.undefined
}

object ConditionalFormatUpdateData {
  @scala.inline
  def apply(
    cellValue: CellValueConditionalFormatUpdateData = null,
    cellValueOrNullObject: CellValueConditionalFormatUpdateData = null,
    colorScale: ColorScaleConditionalFormatUpdateData = null,
    colorScaleOrNullObject: ColorScaleConditionalFormatUpdateData = null,
    custom: CustomConditionalFormatUpdateData = null,
    customOrNullObject: CustomConditionalFormatUpdateData = null,
    dataBar: DataBarConditionalFormatUpdateData = null,
    dataBarOrNullObject: DataBarConditionalFormatUpdateData = null,
    iconSet: IconSetConditionalFormatUpdateData = null,
    iconSetOrNullObject: IconSetConditionalFormatUpdateData = null,
    preset: PresetCriteriaConditionalFormatUpdateData = null,
    presetOrNullObject: PresetCriteriaConditionalFormatUpdateData = null,
    priority: Int | Double = null,
    stopIfTrue: js.UndefOr[Boolean] = js.undefined,
    textComparison: TextConditionalFormatUpdateData = null,
    textComparisonOrNullObject: TextConditionalFormatUpdateData = null,
    topBottom: TopBottomConditionalFormatUpdateData = null,
    topBottomOrNullObject: TopBottomConditionalFormatUpdateData = null
  ): ConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (cellValueOrNullObject != null) __obj.updateDynamic("cellValueOrNullObject")(cellValueOrNullObject)
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale)
    if (colorScaleOrNullObject != null) __obj.updateDynamic("colorScaleOrNullObject")(colorScaleOrNullObject)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (customOrNullObject != null) __obj.updateDynamic("customOrNullObject")(customOrNullObject)
    if (dataBar != null) __obj.updateDynamic("dataBar")(dataBar)
    if (dataBarOrNullObject != null) __obj.updateDynamic("dataBarOrNullObject")(dataBarOrNullObject)
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet)
    if (iconSetOrNullObject != null) __obj.updateDynamic("iconSetOrNullObject")(iconSetOrNullObject)
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (presetOrNullObject != null) __obj.updateDynamic("presetOrNullObject")(presetOrNullObject)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(stopIfTrue)) __obj.updateDynamic("stopIfTrue")(stopIfTrue)
    if (textComparison != null) __obj.updateDynamic("textComparison")(textComparison)
    if (textComparisonOrNullObject != null) __obj.updateDynamic("textComparisonOrNullObject")(textComparisonOrNullObject)
    if (topBottom != null) __obj.updateDynamic("topBottom")(topBottom)
    if (topBottomOrNullObject != null) __obj.updateDynamic("topBottomOrNullObject")(topBottomOrNullObject)
    __obj.asInstanceOf[ConditionalFormatUpdateData]
  }
}

