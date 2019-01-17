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

