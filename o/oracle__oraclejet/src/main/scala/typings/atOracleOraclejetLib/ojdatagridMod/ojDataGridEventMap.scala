package typings
package atOracleOraclejetLib.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDataGridEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojDataGridSettableProperties[K, D]] {
  var bandingIntervalChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Column]
  var cellChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ClassName[K, D]]
  var currentCellChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]]
  var dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Reorder]
  var editModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
  ]
  var gridlinesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Hidden]
  var headerChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]]
  var ojBeforeCurrentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeCurrentCell[K]
  var ojBeforeEdit: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEdit[K, D]
  var ojBeforeEditEnd: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEditEnd[K, D]
  var ojResize: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojResize
  var ojScroll: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojScroll
  var ojSort: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojSort
  var scrollPolicyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
  ]
  var scrollPolicyOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_MaxColumnCount]
  var scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndex[K]]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Cell]
}

