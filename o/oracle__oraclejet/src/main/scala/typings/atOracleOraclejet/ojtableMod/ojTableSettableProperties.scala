package typings.atOracleOraclejet.ojtableMod

import typings.atOracleOraclejet.Anon_AutoClassName
import typings.atOracleOraclejet.Anon_AutoClassNameContext
import typings.atOracleOraclejet.Anon_ColumnIndexColumnKey
import typings.atOracleOraclejet.Anon_ColumnMultiple
import typings.atOracleOraclejet.Anon_DragDropReorderAnonColumns
import typings.atOracleOraclejet.Anon_FetchSizeMaxCount
import typings.atOracleOraclejet.Anon_LabelAccSelectionAffordanceBottom
import typings.atOracleOraclejet.Anon_RowHeader
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.grid
import typings.atOracleOraclejet.atOracleOraclejetStrings.list
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowEdit
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ColumnSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ColumnSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTableNs.CurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTableNs.RowRendererContext
import typings.atOracleOraclejet.ojtableMod.ojTableNs.RowSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTableNs.RowSelectionStart
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTableSettableProperties[K, D] extends baseComponentSettableProperties {
  var accessibility: Anon_RowHeader
  var as: String
  var columns: (js.Array[Anon_AutoClassName[K, D]]) | Null
  var columnsDefault: Anon_AutoClassNameContext[K, D]
  var currentRow: CurrentRow[K] | Null
  var data: (DataProvider[K, D]) | Null
  var display: list | grid
  var dnd: Anon_DragDropReorderAnonColumns[K, D]
  var editMode: none | rowEdit
  val firstSelectedRow: js.Object
  var horizontalGridVisible: auto | enabled | disabled
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: Anon_FetchSizeMaxCount
  var scrollPosition: Anon_ColumnIndexColumnKey
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ]
  var selectionMode: Anon_ColumnMultiple
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: Anon_LabelAccSelectionAffordanceBottom
  var verticalGridVisible: auto | enabled | disabled
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: Anon_RowHeader,
    as: String,
    columnsDefault: Anon_AutoClassNameContext[K, D],
    display: list | grid,
    dnd: Anon_DragDropReorderAnonColumns[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: Anon_FetchSizeMaxCount,
    scrollPosition: Anon_ColumnIndexColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ],
    selectionMode: Anon_ColumnMultiple,
    selectionRequired: Boolean,
    translations: Anon_LabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled,
    columns: js.Array[Anon_AutoClassName[K, D]] = null,
    currentRow: CurrentRow[K] = null,
    data: DataProvider[K, D] = null,
    rowRenderer: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit = null
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility, as = as, columnsDefault = columnsDefault, display = display.asInstanceOf[js.Any], dnd = dnd, editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow, horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions, scrollPosition = scrollPosition, selection = selection, selectionMode = selectionMode, selectionRequired = selectionRequired, translations = translations, verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (currentRow != null) __obj.updateDynamic("currentRow")(currentRow)
    if (data != null) __obj.updateDynamic("data")(data)
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
}

