package typings.oracleOraclejet.ojtableMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ColumnKey
import typings.oracleOraclejet.anon.DropReorder
import typings.oracleOraclejet.anon.Field
import typings.oracleOraclejet.anon.FooterClassName
import typings.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typings.oracleOraclejet.anon.MaxCount
import typings.oracleOraclejet.anon.RowHeader
import typings.oracleOraclejet.anon.`19`
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtable.ojTableSettableProperties<K, D>> */
trait ojTableSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var accessibility: js.UndefOr[RowHeader] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[Field[K, D]]] = js.undefined
  var columnsDefault: js.UndefOr[FooterClassName[K, D]] = js.undefined
  var currentRow: js.UndefOr[CurrentRow[K]] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var display: js.UndefOr[list | grid] = js.undefined
  var dnd: js.UndefOr[DropReorder[K, D]] = js.undefined
  var editMode: js.UndefOr[none | rowEdit] = js.undefined
  var firstSelectedRow: js.UndefOr[js.Object] = js.undefined
  var horizontalGridVisible: js.UndefOr[auto | enabled | disabled] = js.undefined
  var rowRenderer: js.UndefOr[
    js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]
  ] = js.undefined
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll] = js.undefined
  var scrollPolicyOptions: js.UndefOr[MaxCount] = js.undefined
  var scrollPosition: js.UndefOr[ColumnKey] = js.undefined
  var selection: js.UndefOr[
    js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ]
  ] = js.undefined
  var selectionMode: js.UndefOr[`19`] = js.undefined
  var selectionRequired: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[LabelAccSelectionAffordanceBottom] = js.undefined
  var verticalGridVisible: js.UndefOr[auto | enabled | disabled] = js.undefined
}

object ojTableSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    accessibility: RowHeader = null,
    as: String = null,
    columns: js.Array[Field[K, D]] = null,
    columnsDefault: FooterClassName[K, D] = null,
    currentRow: CurrentRow[K] = null,
    data: DataProvider[K, D] = null,
    display: list | grid = null,
    dnd: DropReorder[K, D] = null,
    editMode: none | rowEdit = null,
    firstSelectedRow: js.Object = null,
    horizontalGridVisible: auto | enabled | disabled = null,
    rowRenderer: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit = null,
    scrollPolicy: auto | loadMoreOnScroll = null,
    scrollPolicyOptions: MaxCount = null,
    scrollPosition: ColumnKey = null,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ] = null,
    selectionMode: `19` = null,
    selectionRequired: js.UndefOr[Boolean] = js.undefined,
    translations: LabelAccSelectionAffordanceBottom = null,
    verticalGridVisible: auto | enabled | disabled = null
  ): ojTableSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (columnsDefault != null) __obj.updateDynamic("columnsDefault")(columnsDefault.asInstanceOf[js.Any])
    if (currentRow != null) __obj.updateDynamic("currentRow")(currentRow.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (firstSelectedRow != null) __obj.updateDynamic("firstSelectedRow")(firstSelectedRow.asInstanceOf[js.Any])
    if (horizontalGridVisible != null) __obj.updateDynamic("horizontalGridVisible")(horizontalGridVisible.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    if (scrollPolicy != null) __obj.updateDynamic("scrollPolicy")(scrollPolicy.asInstanceOf[js.Any])
    if (scrollPolicyOptions != null) __obj.updateDynamic("scrollPolicyOptions")(scrollPolicyOptions.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionRequired)) __obj.updateDynamic("selectionRequired")(selectionRequired.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (verticalGridVisible != null) __obj.updateDynamic("verticalGridVisible")(verticalGridVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTableSettablePropertiesLenient[K, D]]
  }
}

