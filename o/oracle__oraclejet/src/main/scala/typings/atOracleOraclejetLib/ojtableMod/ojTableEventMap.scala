package typings
package atOracleOraclejetLib.ojtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTableEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojTableSettableProperties[K, D]] {
  var accessibilityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_RowHeader]
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var columnsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null]
  var columnsDefaultChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoClassNameContext[K, D]]
  var currentRowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
  ]
  var dndChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D]]
  var editModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit
  ]
  var firstSelectedRowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var horizontalGridVisibleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ]
  var ojAnimateEnd: atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateStart
  var ojBeforeCurrentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeCurrentRow[K]
  var ojBeforeRowEdit: atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEdit
  var ojBeforeRowEditEnd: atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEditEnd
  var ojSort: atOracleOraclejetLib.ojtableMod.ojTableNs.ojSort
  var rowRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
      java.lang.String | stdLib.HTMLElement | scala.Unit
    ]) | scala.Null
  ]
  var scrollPolicyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  ]
  var scrollPolicyOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSizeMaxCount]
  var scrollPositionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndexColumnKey]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
    ]) | (js.Array[
      atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
    ])
  ]
  var selectionModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnMultiple]
  var selectionRequiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var verticalGridVisibleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ]
}

