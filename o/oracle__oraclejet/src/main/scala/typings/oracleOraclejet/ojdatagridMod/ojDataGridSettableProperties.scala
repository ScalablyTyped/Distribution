package typings.oracleOraclejet.ojdatagridMod

import typings.oracleOraclejet.AnonAccessibleActionableMode
import typings.oracleOraclejet.AnonCell
import typings.oracleOraclejet.AnonClassName
import typings.oracleOraclejet.AnonColumn
import typings.oracleOraclejet.AnonColumnColumnEnd
import typings.oracleOraclejet.AnonColumnIndex
import typings.oracleOraclejet.AnonHidden
import typings.oracleOraclejet.AnonMaxColumnCount
import typings.oracleOraclejet.AnonReorder
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
  var bandingInterval: AnonColumn
  var cell: AnonClassName[K, D]
  var currentCell: CurrentCell[K] | Null
  var data: (DataProvider[K, D]) | Null
  var dnd: AnonReorder
  var editMode: none | cellNavigation | cellEdit
  var gridlines: AnonHidden
  var header: AnonColumnColumnEnd[K, D]
  var scrollPolicy: auto | loadMoreOnScroll | scroll
  var scrollPolicyOptions: AnonMaxColumnCount
  var scrollPosition: AnonColumnIndex[K]
  var selection: js.Array[Selection[K]]
  var selectionMode: AnonCell
  @JSName("translations")
  var translations_ojDataGridSettableProperties: AnonAccessibleActionableMode
}

object ojDataGridSettableProperties {
  @scala.inline
  def apply[K, D](
    bandingInterval: AnonColumn,
    cell: AnonClassName[K, D],
    dnd: AnonReorder,
    editMode: none | cellNavigation | cellEdit,
    gridlines: AnonHidden,
    header: AnonColumnColumnEnd[K, D],
    scrollPolicy: auto | loadMoreOnScroll | scroll,
    scrollPolicyOptions: AnonMaxColumnCount,
    scrollPosition: AnonColumnIndex[K],
    selection: js.Array[Selection[K]],
    selectionMode: AnonCell,
    translations: AnonAccessibleActionableMode,
    currentCell: CurrentCell[K] = null,
    data: DataProvider[K, D] = null
  ): ojDataGridSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(bandingInterval = bandingInterval.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
  }
}

