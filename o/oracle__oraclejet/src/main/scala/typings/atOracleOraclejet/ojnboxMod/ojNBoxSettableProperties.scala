package typings.atOracleOraclejet.ojnboxMod

import typings.atOracleOraclejet.Anon_AnimationDurationCellDefaults
import typings.atOracleOraclejet.Anon_ComponentNameHighlightedCount
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultK
import typings.atOracleOraclejet.atOracleOraclejetStrings.acrossCells
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.color
import typings.atOracleOraclejet.atOracleOraclejetStrings.counts
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.ifRequired
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorColor
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconColor
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconPattern
import typings.atOracleOraclejet.atOracleOraclejetStrings.indicatorIconShape
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.withinCell
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.Cell
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.Column
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.CountLabelContext
import typings.atOracleOraclejet.ojnboxMod.ojNBoxNs.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var cellContent: counts | auto
  var cellMaximize: off | on
  var cells: js.Array[Cell] | js.Promise[js.Array[Cell]] | Null
  var columns: js.Array[Column] | js.Promise[js.Array[Column]] | Null
  var columnsTitle: String
  var data: (DataProvider[K, D]) | Null
  var groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  var groupBehavior: acrossCells | none | withinCell
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var labelTruncation: ifRequired | on
  var maximizedColumn: String
  var maximizedRow: String
  var otherColor: String
  var otherThreshold: Double
  var rows: js.Array[Row] | js.Promise[js.Array[Row]] | Null
  var rowsTitle: String
  var selection: js.Array[K]
  var selectionMode: none | single | multiple
  var styleDefaults: Anon_AnimationDurationCellDefaults
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojNBoxSettableProperties: Anon_ComponentNameHighlightedCount
  def countLabel(context: CountLabelContext): String | Null
}

object ojNBoxSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    cellContent: counts | auto,
    cellMaximize: off | on,
    columnsTitle: String,
    countLabel: CountLabelContext => String | Null,
    groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape,
    groupBehavior: acrossCells | none | withinCell,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    labelTruncation: ifRequired | on,
    maximizedColumn: String,
    maximizedRow: String,
    otherColor: String,
    otherThreshold: Double,
    rowsTitle: String,
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    styleDefaults: Anon_AnimationDurationCellDefaults,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultK[K],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameHighlightedCount,
    cells: js.Array[Cell] | js.Promise[js.Array[Cell]] = null,
    columns: js.Array[Column] | js.Promise[js.Array[Column]] = null,
    data: DataProvider[K, D] = null,
    rows: js.Array[Row] | js.Promise[js.Array[Row]] = null
  ): ojNBoxSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as, cellContent = cellContent.asInstanceOf[js.Any], cellMaximize = cellMaximize.asInstanceOf[js.Any], columnsTitle = columnsTitle, countLabel = js.Any.fromFunction1(countLabel), groupAttributes = groupAttributes.asInstanceOf[js.Any], groupBehavior = groupBehavior.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], labelTruncation = labelTruncation.asInstanceOf[js.Any], maximizedColumn = maximizedColumn, maximizedRow = maximizedRow, otherColor = otherColor, otherThreshold = otherThreshold, rowsTitle = rowsTitle, selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults, tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettableProperties[K, D]]
  }
}

