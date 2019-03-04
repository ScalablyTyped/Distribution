package typings
package atOracleOraclejetLib.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDataGridSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var bandingInterval: atOracleOraclejetLib.Anon_Column
  var cell: atOracleOraclejetLib.Anon_ClassName[K, D]
  var currentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var dnd: atOracleOraclejetLib.Anon_Reorder
  var editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
  var gridlines: atOracleOraclejetLib.Anon_Hidden
  var header: atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_MaxColumnCount
  var scrollPosition: atOracleOraclejetLib.Anon_ColumnIndex[K]
  var selection: js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]
  var selectionMode: atOracleOraclejetLib.Anon_Cell
  @JSName("translations")
  var translations_ojDataGridSettableProperties: atOracleOraclejetLib.Anon_AccessibleActionableMode
}

object ojDataGridSettableProperties {
  @scala.inline
  def apply[K, D](
    bandingInterval: atOracleOraclejetLib.Anon_Column,
    cell: atOracleOraclejetLib.Anon_ClassName[K, D],
    dnd: atOracleOraclejetLib.Anon_Reorder,
    editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit,
    gridlines: atOracleOraclejetLib.Anon_Hidden,
    header: atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D],
    scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll,
    scrollPolicyOptions: atOracleOraclejetLib.Anon_MaxColumnCount,
    scrollPosition: atOracleOraclejetLib.Anon_ColumnIndex[K],
    selection: js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]],
    selectionMode: atOracleOraclejetLib.Anon_Cell,
    translations: atOracleOraclejetLib.Anon_AccessibleActionableMode,
    currentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] = null,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ojDataGridSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(bandingInterval = bandingInterval, cell = cell, dnd = dnd, editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines, header = header, scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions, scrollPosition = scrollPosition, selection = selection, selectionMode = selectionMode, translations = translations)
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
  }
}

