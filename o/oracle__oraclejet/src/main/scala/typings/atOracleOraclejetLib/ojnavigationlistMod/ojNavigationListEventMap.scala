package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNavigationListEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojNavigationListSettableProperties[K, D]] {
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  ]
  var drillModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
  ]
  var edgeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  ]
  var expandedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]]
  var hierarchyMenuThresholdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]]
  var ojAnimateEnd: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart
  var ojBeforeCollapse: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse
  var ojBeforeCurrentItem: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem
  var ojBeforeExpand: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand
  var ojBeforeSelect: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect
  var ojCollapse: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojCollapse
  var ojExpand: atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojExpand
  var overflowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ]
  var rootLabelChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K]
}

