package typings
package atOracleOraclejetLib.ojtreemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTreemapSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: scala.Double
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationUpdateColor: java.lang.String
  var as: java.lang.String
  var colorLabel: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var displayLevels: scala.Double
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var groupGaps: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.outer
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverBehaviorDelay: scala.Double
  var isolatedNode: js.Any
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.sliceAndDiceHorizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliceAndDiceVertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.squarified
  var nodeContent: atOracleOraclejetLib.Anon_ContextRendererAnonInsertDK[K, D]
  var nodeDefaults: atOracleOraclejetLib.Anon_BottomCenter
  var nodeSeparators: atOracleOraclejetLib.atOracleOraclejetLibStrings.bevels | atOracleOraclejetLib.atOracleOraclejetLibStrings.gaps
  var rootNode: js.Any
  var selection: js.Array[_]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var sizeLabel: java.lang.String
  var sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D]
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojTreemapSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal
}

