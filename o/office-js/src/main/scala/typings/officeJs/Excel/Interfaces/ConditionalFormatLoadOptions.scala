package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An object encapsulating a conditional format's range, format, rule, and other properties.
  To learn more about the conditional formatting object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-conditional-formatting | Apply conditional formatting to Excel ranges}.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * The Priority of the Conditional Format within the current ConditionalFormatCollection.
    *
    * [Api set: ExcelApi 1.6]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatLoadOptions] = js.undefined
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
  var priority: js.UndefOr[Boolean] = js.undefined
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
  var textComparison: js.UndefOr[TextConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatLoadOptions] = js.undefined
  /**
    *
    * A type of conditional format. Only one can be set at a time.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object ConditionalFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellValue: CellValueConditionalFormatLoadOptions = null,
    cellValueOrNullObject: CellValueConditionalFormatLoadOptions = null,
    colorScale: ColorScaleConditionalFormatLoadOptions = null,
    colorScaleOrNullObject: ColorScaleConditionalFormatLoadOptions = null,
    custom: CustomConditionalFormatLoadOptions = null,
    customOrNullObject: CustomConditionalFormatLoadOptions = null,
    dataBar: DataBarConditionalFormatLoadOptions = null,
    dataBarOrNullObject: DataBarConditionalFormatLoadOptions = null,
    iconSet: IconSetConditionalFormatLoadOptions = null,
    iconSetOrNullObject: IconSetConditionalFormatLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    preset: PresetCriteriaConditionalFormatLoadOptions = null,
    presetOrNullObject: PresetCriteriaConditionalFormatLoadOptions = null,
    priority: js.UndefOr[Boolean] = js.undefined,
    stopIfTrue: js.UndefOr[Boolean] = js.undefined,
    textComparison: TextConditionalFormatLoadOptions = null,
    textComparisonOrNullObject: TextConditionalFormatLoadOptions = null,
    topBottom: TopBottomConditionalFormatLoadOptions = null,
    topBottomOrNullObject: TopBottomConditionalFormatLoadOptions = null,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): ConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue.asInstanceOf[js.Any])
    if (cellValueOrNullObject != null) __obj.updateDynamic("cellValueOrNullObject")(cellValueOrNullObject.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (colorScaleOrNullObject != null) __obj.updateDynamic("colorScaleOrNullObject")(colorScaleOrNullObject.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (customOrNullObject != null) __obj.updateDynamic("customOrNullObject")(customOrNullObject.asInstanceOf[js.Any])
    if (dataBar != null) __obj.updateDynamic("dataBar")(dataBar.asInstanceOf[js.Any])
    if (dataBarOrNullObject != null) __obj.updateDynamic("dataBarOrNullObject")(dataBarOrNullObject.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (iconSetOrNullObject != null) __obj.updateDynamic("iconSetOrNullObject")(iconSetOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (presetOrNullObject != null) __obj.updateDynamic("presetOrNullObject")(presetOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopIfTrue)) __obj.updateDynamic("stopIfTrue")(stopIfTrue.get.asInstanceOf[js.Any])
    if (textComparison != null) __obj.updateDynamic("textComparison")(textComparison.asInstanceOf[js.Any])
    if (textComparisonOrNullObject != null) __obj.updateDynamic("textComparisonOrNullObject")(textComparisonOrNullObject.asInstanceOf[js.Any])
    if (topBottom != null) __obj.updateDynamic("topBottom")(topBottom.asInstanceOf[js.Any])
    if (topBottomOrNullObject != null) __obj.updateDynamic("topBottomOrNullObject")(topBottomOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormatLoadOptions]
  }
}

