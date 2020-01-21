package typings.oracleOraclejet.ojtableMod

import typings.oracleOraclejet.AnonAutoClassName
import typings.oracleOraclejet.AnonAutoClassNameContext
import typings.oracleOraclejet.AnonColumnIndexColumnKey
import typings.oracleOraclejet.AnonColumnMultiple
import typings.oracleOraclejet.AnonDragDropReorderAnonColumns
import typings.oracleOraclejet.AnonFetchSizeMaxCount
import typings.oracleOraclejet.AnonLabelAccSelectionAffordanceBottom
import typings.oracleOraclejet.AnonRowHeader
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typings.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.grid
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.rowEdit
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTableSettableProperties[K, D] extends baseComponentSettableProperties {
  var accessibility: AnonRowHeader
  var as: String
  var columns: (js.Array[AnonAutoClassName[K, D]]) | Null
  var columnsDefault: AnonAutoClassNameContext[K, D]
  var currentRow: CurrentRow[K] | Null
  var data: (DataProvider[K, D]) | Null
  var display: list | grid
  var dnd: AnonDragDropReorderAnonColumns[K, D]
  var editMode: none | rowEdit
  val firstSelectedRow: js.Object
  var horizontalGridVisible: auto | enabled | disabled
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: AnonFetchSizeMaxCount
  var scrollPosition: AnonColumnIndexColumnKey
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ]
  var selectionMode: AnonColumnMultiple
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: AnonLabelAccSelectionAffordanceBottom
  var verticalGridVisible: auto | enabled | disabled
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: AnonRowHeader,
    as: String,
    columnsDefault: AnonAutoClassNameContext[K, D],
    display: list | grid,
    dnd: AnonDragDropReorderAnonColumns[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: AnonFetchSizeMaxCount,
    scrollPosition: AnonColumnIndexColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ],
    selectionMode: AnonColumnMultiple,
    selectionRequired: Boolean,
    translations: AnonLabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled,
    columns: js.Array[AnonAutoClassName[K, D]] = null,
    currentRow: CurrentRow[K] = null,
    data: DataProvider[K, D] = null,
    rowRenderer: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit = null
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], columnsDefault = columnsDefault.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow.asInstanceOf[js.Any], horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (currentRow != null) __obj.updateDynamic("currentRow")(currentRow.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
}

