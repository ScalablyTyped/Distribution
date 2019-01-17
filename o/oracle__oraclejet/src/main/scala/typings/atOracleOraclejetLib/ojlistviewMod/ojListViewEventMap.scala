package typings
package atOracleOraclejetLib.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojListViewEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojListViewSettableProperties[K, D]] {
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]]
  var dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorder]
  var drillModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ]
  var expandedChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]]
  var firstSelectedItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DataKey[K, D]]
  var groupHeaderPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
  ]
  var itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focusable[K, D]]
  var ojAnimateEnd: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateStart
  var ojBeforeCollapse: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCollapse[K]
  var ojBeforeCurrentItem: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCurrentItem[K]
  var ojBeforeExpand: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeExpand[K]
  var ojCollapse: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCollapse[K]
  var ojCopy: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCopy
  var ojCut: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCut
  var ojExpand: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojExpand[K]
  var ojPaste: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojPaste
  var ojReorder: atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojReorder
  var scrollPolicyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  ]
  var scrollPolicyOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSize]
  var scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_IndexKey[K]]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ]
  var selectionRequiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
}

