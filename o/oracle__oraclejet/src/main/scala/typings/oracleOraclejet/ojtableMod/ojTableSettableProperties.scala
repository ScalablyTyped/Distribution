package typings.oracleOraclejet.ojtableMod

import typings.oracleOraclejet.anon.ColumnKey
import typings.oracleOraclejet.anon.DropReorder
import typings.oracleOraclejet.anon.Field
import typings.oracleOraclejet.anon.FooterClassName
import typings.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typings.oracleOraclejet.anon.MaxCount
import typings.oracleOraclejet.anon.RowHeader
import typings.oracleOraclejet.anon.`19`
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
  var accessibility: RowHeader
  var as: String
  var columns: (js.Array[Field[K, D]]) | Null
  var columnsDefault: FooterClassName[K, D]
  var currentRow: CurrentRow[K] | Null
  var data: (DataProvider[K, D]) | Null
  var display: list | grid
  var dnd: DropReorder[K, D]
  var editMode: none | rowEdit
  val firstSelectedRow: js.Object
  var horizontalGridVisible: auto | enabled | disabled
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: MaxCount
  var scrollPosition: ColumnKey
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ]
  var selectionMode: `19`
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: LabelAccSelectionAffordanceBottom
  var verticalGridVisible: auto | enabled | disabled
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: RowHeader,
    as: String,
    columnsDefault: FooterClassName[K, D],
    display: list | grid,
    dnd: DropReorder[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: MaxCount,
    scrollPosition: ColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ],
    selectionMode: `19`,
    selectionRequired: Boolean,
    translations: LabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled,
    columns: js.Array[Field[K, D]] = null,
    currentRow: CurrentRow[K] = null,
    data: DataProvider[K, D] = null,
    rowRenderer: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit = null
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], columnsDefault = columnsDefault.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow.asInstanceOf[js.Any], horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], currentRow = currentRow.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer))
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
}

