package typings.oracleOraclejet.ojdatagridMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonAccessibleActionableMode
import typings.oracleOraclejet.AnonCell
import typings.oracleOraclejet.AnonClassName
import typings.oracleOraclejet.AnonColumn
import typings.oracleOraclejet.AnonColumnEnd
import typings.oracleOraclejet.AnonColumnIndex
import typings.oracleOraclejet.AnonHorizontal
import typings.oracleOraclejet.AnonMaxColumnCount
import typings.oracleOraclejet.AnonReorder
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatagrid.ojDataGridSettableProperties<K, D>> */
trait ojDataGridSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var bandingInterval: js.UndefOr[AnonColumn] = js.undefined
  var cell: js.UndefOr[AnonClassName[K, D]] = js.undefined
  var currentCell: js.UndefOr[CurrentCell[K]] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var dnd: js.UndefOr[AnonReorder] = js.undefined
  var editMode: js.UndefOr[none | cellNavigation | cellEdit] = js.undefined
  var gridlines: js.UndefOr[AnonHorizontal] = js.undefined
  var header: js.UndefOr[AnonColumnEnd[K, D]] = js.undefined
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll | scroll] = js.undefined
  var scrollPolicyOptions: js.UndefOr[AnonMaxColumnCount] = js.undefined
  var scrollPosition: js.UndefOr[AnonColumnIndex[K]] = js.undefined
  var selection: js.UndefOr[js.Array[Selection[K]]] = js.undefined
  var selectionMode: js.UndefOr[AnonCell] = js.undefined
  var translations: js.UndefOr[AnonAccessibleActionableMode] = js.undefined
}

object ojDataGridSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bandingInterval: AnonColumn = null,
    cell: AnonClassName[K, D] = null,
    currentCell: CurrentCell[K] = null,
    data: DataProvider[K, D] = null,
    dnd: AnonReorder = null,
    editMode: none | cellNavigation | cellEdit = null,
    gridlines: AnonHorizontal = null,
    header: AnonColumnEnd[K, D] = null,
    scrollPolicy: auto | loadMoreOnScroll | scroll = null,
    scrollPolicyOptions: AnonMaxColumnCount = null,
    scrollPosition: AnonColumnIndex[K] = null,
    selection: js.Array[Selection[K]] = null,
    selectionMode: AnonCell = null,
    translations: AnonAccessibleActionableMode = null
  ): ojDataGridSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bandingInterval != null) __obj.updateDynamic("bandingInterval")(bandingInterval.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (gridlines != null) __obj.updateDynamic("gridlines")(gridlines.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (scrollPolicy != null) __obj.updateDynamic("scrollPolicy")(scrollPolicy.asInstanceOf[js.Any])
    if (scrollPolicyOptions != null) __obj.updateDynamic("scrollPolicyOptions")(scrollPolicyOptions.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridSettablePropertiesLenient[K, D]]
  }
}

