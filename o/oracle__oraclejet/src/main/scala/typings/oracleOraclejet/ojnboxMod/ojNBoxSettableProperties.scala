package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.anon.CellDefaults
import typings.oracleOraclejet.anon.HighlightedCount
import typings.oracleOraclejet.anon.`13`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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
  var styleDefaults: CellDefaults
  var tooltip: `13`[K]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojNBoxSettableProperties: HighlightedCount
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
    styleDefaults: CellDefaults,
    tooltip: `13`[K],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: HighlightedCount,
    cells: js.Array[Cell] | js.Promise[js.Array[Cell]] = null,
    columns: js.Array[Column] | js.Promise[js.Array[Column]] = null,
    data: DataProvider[K, D] = null,
    rows: js.Array[Row] | js.Promise[js.Array[Row]] = null
  ): ojNBoxSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any], cellMaximize = cellMaximize.asInstanceOf[js.Any], columnsTitle = columnsTitle.asInstanceOf[js.Any], countLabel = js.Any.fromFunction1(countLabel), groupAttributes = groupAttributes.asInstanceOf[js.Any], groupBehavior = groupBehavior.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], labelTruncation = labelTruncation.asInstanceOf[js.Any], maximizedColumn = maximizedColumn.asInstanceOf[js.Any], maximizedRow = maximizedRow.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], rowsTitle = rowsTitle.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettableProperties[K, D]]
  }
}

