package typings.oracleOraclejet.ojdatagridMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AccessibleActionableMode
import typings.oracleOraclejet.anon.Cell
import typings.oracleOraclejet.anon.ClassName
import typings.oracleOraclejet.anon.Column
import typings.oracleOraclejet.anon.ColumnEnd
import typings.oracleOraclejet.anon.ColumnIndex
import typings.oracleOraclejet.anon.Horizontal
import typings.oracleOraclejet.anon.MaxColumnCount
import typings.oracleOraclejet.anon.Reorder
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
@js.native
trait ojDataGridSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var bandingInterval: js.UndefOr[Column] = js.native
  var cell: js.UndefOr[ClassName[K, D]] = js.native
  var currentCell: js.UndefOr[CurrentCell[K] | Null] = js.native
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  var dnd: js.UndefOr[Reorder] = js.native
  var editMode: js.UndefOr[none | cellNavigation | cellEdit] = js.native
  var gridlines: js.UndefOr[Horizontal] = js.native
  var header: js.UndefOr[ColumnEnd[K, D]] = js.native
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll | scroll] = js.native
  var scrollPolicyOptions: js.UndefOr[MaxColumnCount] = js.native
  var scrollPosition: js.UndefOr[ColumnIndex[K]] = js.native
  var selection: js.UndefOr[js.Array[Selection[K]]] = js.native
  var selectionMode: js.UndefOr[Cell] = js.native
  var translations: js.UndefOr[AccessibleActionableMode] = js.native
}

object ojDataGridSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojDataGridSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDataGridSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojDataGridSettablePropertiesLenientOps[Self <: ojDataGridSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojDataGridSettablePropertiesLenient[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBandingInterval(value: Column): Self = this.set("bandingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandingInterval: Self = this.set("bandingInterval", js.undefined)
    @scala.inline
    def setCell(value: ClassName[K, D]): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setCurrentCell(value: CurrentCell[K]): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCell: Self = this.set("currentCell", js.undefined)
    @scala.inline
    def setCurrentCellNull: Self = this.set("currentCell", null)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setDnd(value: Reorder): Self = this.set("dnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    @scala.inline
    def setEditMode(value: none | cellNavigation | cellEdit): Self = this.set("editMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    @scala.inline
    def setGridlines(value: Horizontal): Self = this.set("gridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridlines: Self = this.set("gridlines", js.undefined)
    @scala.inline
    def setHeader(value: ColumnEnd[K, D]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self = this.set("scrollPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPolicy: Self = this.set("scrollPolicy", js.undefined)
    @scala.inline
    def setScrollPolicyOptions(value: MaxColumnCount): Self = this.set("scrollPolicyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPolicyOptions: Self = this.set("scrollPolicyOptions", js.undefined)
    @scala.inline
    def setScrollPosition(value: ColumnIndex[K]): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: Selection[K]*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[Selection[K]]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: Cell): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setTranslations(value: AccessibleActionableMode): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

