package typings.oracleOraclejet.ojnboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.Anon13
import typings.oracleOraclejet.AnonCellDefaults
import typings.oracleOraclejet.AnonHighlightedCount
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojnboxMod.ojNBox.Cell
import typings.oracleOraclejet.ojnboxMod.ojNBox.Column
import typings.oracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typings.oracleOraclejet.ojnboxMod.ojNBox.Row
import typings.oracleOraclejet.oracleOraclejetStrings.acrossCells
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.counts
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.ifRequired
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorColor
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconColor
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconPattern
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconShape
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.withinCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnbox.ojNBoxSettableProperties<K, D>> */
trait ojNBoxSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var cellContent: js.UndefOr[counts | auto] = js.undefined
  var cellMaximize: js.UndefOr[off | on] = js.undefined
  var cells: js.UndefOr[js.Array[Cell] | js.Promise[js.Array[Cell]]] = js.undefined
  var columns: js.UndefOr[js.Array[Column] | js.Promise[js.Array[Column]]] = js.undefined
  var columnsTitle: js.UndefOr[String] = js.undefined
  var countLabel: js.UndefOr[js.Function1[/* context */ CountLabelContext, String | Null]] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var groupAttributes: js.UndefOr[
    color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  ] = js.undefined
  var groupBehavior: js.UndefOr[acrossCells | none | withinCell] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var labelTruncation: js.UndefOr[ifRequired | on] = js.undefined
  var maximizedColumn: js.UndefOr[String] = js.undefined
  var maximizedRow: js.UndefOr[String] = js.undefined
  var otherColor: js.UndefOr[String] = js.undefined
  var otherThreshold: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[js.Array[Row] | js.Promise[js.Array[Row]]] = js.undefined
  var rowsTitle: js.UndefOr[String] = js.undefined
  var selection: js.UndefOr[js.Array[K]] = js.undefined
  var selectionMode: js.UndefOr[none | single | multiple] = js.undefined
  var styleDefaults: js.UndefOr[AnonCellDefaults] = js.undefined
  var tooltip: js.UndefOr[Anon13[K]] = js.undefined
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonHighlightedCount] = js.undefined
}

object ojNBoxSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    as: String = null,
    cellContent: counts | auto = null,
    cellMaximize: off | on = null,
    cells: js.Array[Cell] | js.Promise[js.Array[Cell]] = null,
    columns: js.Array[Column] | js.Promise[js.Array[Column]] = null,
    columnsTitle: String = null,
    countLabel: /* context */ CountLabelContext => String | Null = null,
    data: DataProvider[K, D] = null,
    groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape = null,
    groupBehavior: acrossCells | none | withinCell = null,
    hiddenCategories: js.Array[String] = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    labelTruncation: ifRequired | on = null,
    maximizedColumn: String = null,
    maximizedRow: String = null,
    otherColor: String = null,
    otherThreshold: Int | Double = null,
    rows: js.Array[Row] | js.Promise[js.Array[Row]] = null,
    rowsTitle: String = null,
    selection: js.Array[K] = null,
    selectionMode: none | single | multiple = null,
    styleDefaults: AnonCellDefaults = null,
    tooltip: Anon13[K] = null,
    touchResponse: touchStart | auto = null,
    trackResize: on | off = null,
    translations: AnonHighlightedCount = null
  ): ojNBoxSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (cellContent != null) __obj.updateDynamic("cellContent")(cellContent.asInstanceOf[js.Any])
    if (cellMaximize != null) __obj.updateDynamic("cellMaximize")(cellMaximize.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (columnsTitle != null) __obj.updateDynamic("columnsTitle")(columnsTitle.asInstanceOf[js.Any])
    if (countLabel != null) __obj.updateDynamic("countLabel")(js.Any.fromFunction1(countLabel))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (groupAttributes != null) __obj.updateDynamic("groupAttributes")(groupAttributes.asInstanceOf[js.Any])
    if (groupBehavior != null) __obj.updateDynamic("groupBehavior")(groupBehavior.asInstanceOf[js.Any])
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (labelTruncation != null) __obj.updateDynamic("labelTruncation")(labelTruncation.asInstanceOf[js.Any])
    if (maximizedColumn != null) __obj.updateDynamic("maximizedColumn")(maximizedColumn.asInstanceOf[js.Any])
    if (maximizedRow != null) __obj.updateDynamic("maximizedRow")(maximizedRow.asInstanceOf[js.Any])
    if (otherColor != null) __obj.updateDynamic("otherColor")(otherColor.asInstanceOf[js.Any])
    if (otherThreshold != null) __obj.updateDynamic("otherThreshold")(otherThreshold.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsTitle != null) __obj.updateDynamic("rowsTitle")(rowsTitle.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (styleDefaults != null) __obj.updateDynamic("styleDefaults")(styleDefaults.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (touchResponse != null) __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettablePropertiesLenient[K, D]]
  }
}

