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
  var selection: js.Array[
    (atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]) | (atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K])
  ]
  var selectionMode: atOracleOraclejetLib.Anon_ColumnMultiple
  var selectionRequired: scala.Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: atOracleOraclejetLib.Anon_LabelAccSelectionAffordanceBottom
  var verticalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: atOracleOraclejetLib.Anon_RowHeader,
    as: java.lang.String,
    columnsDefault: atOracleOraclejetLib.Anon_AutoClassNameContext[K, D],
    display: atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid,
    dnd: atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D],
    editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled,
    scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll,
    scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSizeMaxCount,
    scrollPosition: atOracleOraclejetLib.Anon_ColumnIndexColumnKey,
    selection: js.Array[
      (atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]) | (atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K])
    ],
    selectionMode: atOracleOraclejetLib.Anon_ColumnMultiple,
    selectionRequired: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_LabelAccSelectionAffordanceBottom,
    verticalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled,
    columns: js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]] = null,
    currentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] = null,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    rowRenderer: /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D] => java.lang.String | stdLib.HTMLElement | scala.Unit = null
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility, as = as, columnsDefault = columnsDefault, display = display.asInstanceOf[js.Any], dnd = dnd, editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow, horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions, scrollPosition = scrollPosition, selection = selection, selectionMode = selectionMode, selectionRequired = selectionRequired, translations = translations, verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (currentRow != null) __obj.updateDynamic("currentRow")(currentRow)
    if (data != null) __obj.updateDynamic("data")(data)
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
}

