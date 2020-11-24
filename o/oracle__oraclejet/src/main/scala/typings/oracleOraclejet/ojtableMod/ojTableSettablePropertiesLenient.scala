package typings.oracleOraclejet.ojtableMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ColumnKey
import typings.oracleOraclejet.anon.DropReorder
import typings.oracleOraclejet.anon.Field
import typings.oracleOraclejet.anon.FooterClassName
import typings.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typings.oracleOraclejet.anon.MaxCount
import typings.oracleOraclejet.anon.RowHeader
import typings.oracleOraclejet.anon.`21`
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtable.ojTableSettableProperties<K, D>> */
@js.native
trait ojTableSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var accessibility: js.UndefOr[RowHeader] = js.native
  
  var as: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[(js.Array[Field[K, D]]) | Null] = js.native
  
  var columnsDefault: js.UndefOr[FooterClassName[K, D]] = js.native
  
  var currentRow: js.UndefOr[CurrentRow[K] | Null] = js.native
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  
  var display: js.UndefOr[list | grid] = js.native
  
  var dnd: js.UndefOr[DropReorder[K, D]] = js.native
  
  var editMode: js.UndefOr[none | rowEdit] = js.native
  
  var firstSelectedRow: js.UndefOr[js.Object] = js.native
  
  var horizontalGridVisible: js.UndefOr[auto | enabled | disabled] = js.native
  
  var rowRenderer: js.UndefOr[
    (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  ] = js.native
  
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll] = js.native
  
  var scrollPolicyOptions: js.UndefOr[MaxCount] = js.native
  
  var scrollPosition: js.UndefOr[ColumnKey] = js.native
  
  var selection: js.UndefOr[
    js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ]
  ] = js.native
  
  var selectionMode: js.UndefOr[`21`] = js.native
  
  var selectionRequired: js.UndefOr[Boolean] = js.native
  
  var translations: js.UndefOr[LabelAccSelectionAffordanceBottom] = js.native
  
  var verticalGridVisible: js.UndefOr[auto | enabled | disabled] = js.native
}
object ojTableSettablePropertiesLenient {
  
  @scala.inline
  def apply[K, D](): ojTableSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTableSettablePropertiesLenient[K, D]]
  }
  
  @scala.inline
  implicit class ojTableSettablePropertiesLenientOps[Self <: ojTableSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojTableSettablePropertiesLenient[K, D])) extends AnyVal {
    
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
    def setAccessibility(value: RowHeader): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (Field[K, D])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Field[K, D]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setColumnsNull: Self = this.set("columns", null)
    
    @scala.inline
    def setColumnsDefault(value: FooterClassName[K, D]): Self = this.set("columnsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnsDefault: Self = this.set("columnsDefault", js.undefined)
    
    @scala.inline
    def setCurrentRow(value: CurrentRow[K]): Self = this.set("currentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRow: Self = this.set("currentRow", js.undefined)
    
    @scala.inline
    def setCurrentRowNull: Self = this.set("currentRow", null)
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setDisplay(value: list | grid): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDnd(value: DropReorder[K, D]): Self = this.set("dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    
    @scala.inline
    def setEditMode(value: none | rowEdit): Self = this.set("editMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    
    @scala.inline
    def setFirstSelectedRow(value: js.Object): Self = this.set("firstSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSelectedRow: Self = this.set("firstSelectedRow", js.undefined)
    
    @scala.inline
    def setHorizontalGridVisible(value: auto | enabled | disabled): Self = this.set("horizontalGridVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalGridVisible: Self = this.set("horizontalGridVisible", js.undefined)
    
    @scala.inline
    def setRowRenderer(value: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit): Self = this.set("rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowRenderer: Self = this.set("rowRenderer", js.undefined)
    
    @scala.inline
    def setRowRendererNull: Self = this.set("rowRenderer", null)
    
    @scala.inline
    def setScrollPolicy(value: auto | loadMoreOnScroll): Self = this.set("scrollPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPolicy: Self = this.set("scrollPolicy", js.undefined)
    
    @scala.inline
    def setScrollPolicyOptions(value: MaxCount): Self = this.set("scrollPolicyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPolicyOptions: Self = this.set("scrollPolicyOptions", js.undefined)
    
    @scala.inline
    def setScrollPosition(value: ColumnKey): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(
      value: ((RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K]))*
    ): Self = this.set("selection", js.Array(value :_*))
    
    @scala.inline
    def setSelection(
      value: js.Array[
          (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
        ]
    ): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: `21`): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionRequired(value: Boolean): Self = this.set("selectionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionRequired: Self = this.set("selectionRequired", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelAccSelectionAffordanceBottom): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setVerticalGridVisible(value: auto | enabled | disabled): Self = this.set("verticalGridVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalGridVisible: Self = this.set("verticalGridVisible", js.undefined)
  }
}
