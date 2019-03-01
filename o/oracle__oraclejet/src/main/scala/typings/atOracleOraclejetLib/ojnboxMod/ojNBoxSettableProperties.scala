package typings
package atOracleOraclejetLib.ojnboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var cellContent: atOracleOraclejetLib.atOracleOraclejetLibStrings.counts | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var cellMaximize: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var cells: js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Cell] | js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Cell]] | scala.Null
  var columns: js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Column] | js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Column]] | scala.Null
  var columnsTitle: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var groupAttributes: atOracleOraclejetLib.atOracleOraclejetLibStrings.color | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconPattern | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconShape
  var groupBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.acrossCells | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.withinCell
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var labelTruncation: atOracleOraclejetLib.atOracleOraclejetLibStrings.ifRequired | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var maximizedColumn: java.lang.String
  var maximizedRow: java.lang.String
  var otherColor: java.lang.String
  var otherThreshold: scala.Double
  var rows: js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Row] | js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Row]] | scala.Null
  var rowsTitle: java.lang.String
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var styleDefaults: atOracleOraclejetLib.Anon_AnimationDurationCellDefaults
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultK[K]
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojNBoxSettableProperties: atOracleOraclejetLib.Anon_ComponentNameHighlightedCount
  def countLabel(context: atOracleOraclejetLib.ojnboxMod.ojNBoxNs.CountLabelContext): java.lang.String | scala.Null
}

object ojNBoxSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    cellContent: atOracleOraclejetLib.atOracleOraclejetLibStrings.counts | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    cellMaximize: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    columnsTitle: java.lang.String,
    countLabel: js.Function1[
      atOracleOraclejetLib.ojnboxMod.ojNBoxNs.CountLabelContext, 
      java.lang.String | scala.Null
    ],
    groupAttributes: atOracleOraclejetLib.atOracleOraclejetLibStrings.color | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconColor | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconPattern | atOracleOraclejetLib.atOracleOraclejetLibStrings.indicatorIconShape,
    groupBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.acrossCells | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.withinCell,
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    labelTruncation: atOracleOraclejetLib.atOracleOraclejetLibStrings.ifRequired | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    maximizedColumn: java.lang.String,
    maximizedRow: java.lang.String,
    otherColor: java.lang.String,
    otherThreshold: scala.Double,
    rowsTitle: java.lang.String,
    selection: js.Array[K],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple,
    styleDefaults: atOracleOraclejetLib.Anon_AnimationDurationCellDefaults,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultK[K],
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameHighlightedCount,
    cells: js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Cell] | js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Cell]] = null,
    columns: js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Column] | js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Column]] = null,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    rows: js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Row] | js.Promise[js.Array[atOracleOraclejetLib.ojnboxMod.ojNBoxNs.Row]] = null
  ): ojNBoxSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("cellContent")(cellContent.asInstanceOf[js.Any])
    __obj.updateDynamic("cellMaximize")(cellMaximize.asInstanceOf[js.Any])
    __obj.updateDynamic("columnsTitle")(columnsTitle)
    __obj.updateDynamic("countLabel")(countLabel)
    __obj.updateDynamic("groupAttributes")(groupAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("groupBehavior")(groupBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("hiddenCategories")(hiddenCategories)
    __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightedCategories")(highlightedCategories)
    __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("labelTruncation")(labelTruncation.asInstanceOf[js.Any])
    __obj.updateDynamic("maximizedColumn")(maximizedColumn)
    __obj.updateDynamic("maximizedRow")(maximizedRow)
    __obj.updateDynamic("otherColor")(otherColor)
    __obj.updateDynamic("otherThreshold")(otherThreshold)
    __obj.updateDynamic("rowsTitle")(rowsTitle)
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("styleDefaults")(styleDefaults)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettableProperties[K, D]]
  }
}

