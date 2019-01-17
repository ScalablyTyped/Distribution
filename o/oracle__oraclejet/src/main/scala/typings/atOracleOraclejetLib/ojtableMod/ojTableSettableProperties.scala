package typings
package atOracleOraclejetLib.ojtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTableSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var accessibility: atOracleOraclejetLib.Anon_RowHeader
  var as: java.lang.String
  var columns: (js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null
  var columnsDefault: atOracleOraclejetLib.Anon_AutoClassNameContext[K, D]
  var currentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
  var dnd: atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D]
  var editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit
  val firstSelectedRow: js.Object
  var horizontalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  var rowRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
    java.lang.String | stdLib.HTMLElement | scala.Unit
  ]) | scala.Null
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSizeMaxCount
  var scrollPosition: atOracleOraclejetLib.Anon_ColumnIndexColumnKey
  var selection: (js.Array[
    atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
  ]) | (js.Array[
    atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
  ])
  var selectionMode: atOracleOraclejetLib.Anon_ColumnMultiple
  var selectionRequired: scala.Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: atOracleOraclejetLib.Anon_LabelAccSelectionAffordanceBottom
  var verticalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
}

