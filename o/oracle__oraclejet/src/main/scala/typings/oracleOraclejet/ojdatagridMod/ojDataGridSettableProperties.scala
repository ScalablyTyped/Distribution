package typings.oracleOraclejet.ojdatagridMod

import typings.oracleOraclejet.anon.AccessibleActionableMode
import typings.oracleOraclejet.anon.Cell
import typings.oracleOraclejet.anon.ClassName
import typings.oracleOraclejet.anon.Column
import typings.oracleOraclejet.anon.ColumnEnd
import typings.oracleOraclejet.anon.ColumnIndex
import typings.oracleOraclejet.anon.Horizontal
import typings.oracleOraclejet.anon.MaxColumnCount
import typings.oracleOraclejet.anon.Reorder
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.cellEdit
import typings.oracleOraclejet.oracleOraclejetStrings.cellNavigation
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDataGridSettableProperties[K, D] extends baseComponentSettableProperties {
  var bandingInterval: Column
  var cell: ClassName[K, D]
  var currentCell: CurrentCell[K] | Null
  var data: (DataProvider[K, D]) | Null
  var dnd: Reorder
  var editMode: none | cellNavigation | cellEdit
  var gridlines: Horizontal
  var header: ColumnEnd[K, D]
  var scrollPolicy: auto | loadMoreOnScroll | scroll
  var scrollPolicyOptions: MaxColumnCount
  var scrollPosition: ColumnIndex[K]
  var selection: js.Array[Selection[K]]
  var selectionMode: Cell
  @JSName("translations")
  var translations_ojDataGridSettableProperties: AccessibleActionableMode
}

object ojDataGridSettableProperties {
  @scala.inline
  def apply[K, D](
    bandingInterval: Column,
    cell: ClassName[K, D],
    dnd: Reorder,
    editMode: none | cellNavigation | cellEdit,
    gridlines: Horizontal,
    header: ColumnEnd[K, D],
    scrollPolicy: auto | loadMoreOnScroll | scroll,
    scrollPolicyOptions: MaxColumnCount,
    scrollPosition: ColumnIndex[K],
    selection: js.Array[Selection[K]],
    selectionMode: Cell,
    translations: AccessibleActionableMode,
    currentCell: CurrentCell[K] = null,
    data: DataProvider[K, D] = null
  ): ojDataGridSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(bandingInterval = bandingInterval.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], currentCell = currentCell.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
  }
}

