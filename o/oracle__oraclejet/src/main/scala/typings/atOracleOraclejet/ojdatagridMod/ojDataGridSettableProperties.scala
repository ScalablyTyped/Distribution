package typings.atOracleOraclejet.ojdatagridMod

import typings.atOracleOraclejet.Anon_AccessibleActionableMode
import typings.atOracleOraclejet.Anon_Cell
import typings.atOracleOraclejet.Anon_ClassName
import typings.atOracleOraclejet.Anon_Column
import typings.atOracleOraclejet.Anon_ColumnColumnEnd
import typings.atOracleOraclejet.Anon_ColumnIndex
import typings.atOracleOraclejet.Anon_Hidden
import typings.atOracleOraclejet.Anon_MaxColumnCount
import typings.atOracleOraclejet.Anon_Reorder
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellEdit
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellNavigation
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.scroll
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDataGridSettableProperties[K, D] extends baseComponentSettableProperties {
  var bandingInterval: Anon_Column
  var cell: Anon_ClassName[K, D]
  var currentCell: CurrentCell[K] | Null
  var data: (DataProvider[K, D]) | Null
  var dnd: Anon_Reorder
  var editMode: none | cellNavigation | cellEdit
  var gridlines: Anon_Hidden
  var header: Anon_ColumnColumnEnd[K, D]
  var scrollPolicy: auto | loadMoreOnScroll | scroll
  var scrollPolicyOptions: Anon_MaxColumnCount
  var scrollPosition: Anon_ColumnIndex[K]
  var selection: js.Array[Selection[K]]
  var selectionMode: Anon_Cell
  @JSName("translations")
  var translations_ojDataGridSettableProperties: Anon_AccessibleActionableMode
}

object ojDataGridSettableProperties {
  @scala.inline
  def apply[K, D](
    bandingInterval: Anon_Column,
    cell: Anon_ClassName[K, D],
    dnd: Anon_Reorder,
    editMode: none | cellNavigation | cellEdit,
    gridlines: Anon_Hidden,
    header: Anon_ColumnColumnEnd[K, D],
    scrollPolicy: auto | loadMoreOnScroll | scroll,
    scrollPolicyOptions: Anon_MaxColumnCount,
    scrollPosition: Anon_ColumnIndex[K],
    selection: js.Array[Selection[K]],
    selectionMode: Anon_Cell,
    translations: Anon_AccessibleActionableMode,
    currentCell: CurrentCell[K] = null,
    data: DataProvider[K, D] = null
  ): ojDataGridSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(bandingInterval = bandingInterval, cell = cell, dnd = dnd, editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines, header = header, scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions, scrollPosition = scrollPosition, selection = selection, selectionMode = selectionMode, translations = translations)
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
  }
}

