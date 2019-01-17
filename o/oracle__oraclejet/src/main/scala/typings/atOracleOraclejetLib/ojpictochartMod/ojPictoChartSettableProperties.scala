package typings
package atOracleOraclejetLib.ojpictochartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.popIn | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var columnCount: scala.Double | scala.Null
  var columnWidth: scala.Double | scala.Null
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverBehaviorDelay: scala.Double
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  var layoutOrigin: atOracleOraclejetLib.atOracleOraclejetLibStrings.topEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottomStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottomEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.topStart
  var rowCount: scala.Double | scala.Null
  var rowHeight: scala.Double | scala.Null
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]
  @JSName("translations")
  var translations_ojPictoChartSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
}

