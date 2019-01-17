package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNavigationListSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var as: java.lang.String
  var currentItem: K
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  var drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
  var edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  var hierarchyMenuThreshold: scala.Double
  var item: atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]
  var overflow: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  var rootLabel: java.lang.String | scala.Null
  var selection: K
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: atOracleOraclejetLib.Anon_DefaultRootLabel
}

