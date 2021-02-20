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
import org.scalablytyped.runtime.StObject
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
  implicit class ojTableSettablePropertiesLenientMutableBuilder[Self <: ojTableSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojTableSettablePropertiesLenient[K, D])) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: RowHeader): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[Field[K, D]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsDefault(value: FooterClassName[K, D]): Self = StObject.set(x, "columnsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsDefaultUndefined: Self = StObject.set(x, "columnsDefault", js.undefined)
    
    @scala.inline
    def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (Field[K, D])*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCurrentRow(value: CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRowNull: Self = StObject.set(x, "currentRow", null)
    
    @scala.inline
    def setCurrentRowUndefined: Self = StObject.set(x, "currentRow", js.undefined)
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDisplay(value: list | grid): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDnd(value: DropReorder[K, D]): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    @scala.inline
    def setEditMode(value: none | rowEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
    
    @scala.inline
    def setFirstSelectedRow(value: js.Object): Self = StObject.set(x, "firstSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSelectedRowUndefined: Self = StObject.set(x, "firstSelectedRow", js.undefined)
    
    @scala.inline
    def setHorizontalGridVisible(value: auto | enabled | disabled): Self = StObject.set(x, "horizontalGridVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalGridVisibleUndefined: Self = StObject.set(x, "horizontalGridVisible", js.undefined)
    
    @scala.inline
    def setRowRenderer(value: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowRendererNull: Self = StObject.set(x, "rowRenderer", null)
    
    @scala.inline
    def setRowRendererUndefined: Self = StObject.set(x, "rowRenderer", js.undefined)
    
    @scala.inline
    def setScrollPolicy(value: auto | loadMoreOnScroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPolicyOptions(value: MaxCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPolicyOptionsUndefined: Self = StObject.set(x, "scrollPolicyOptions", js.undefined)
    
    @scala.inline
    def setScrollPolicyUndefined: Self = StObject.set(x, "scrollPolicy", js.undefined)
    
    @scala.inline
    def setScrollPosition(value: ColumnKey): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
    
    @scala.inline
    def setSelection(
      value: js.Array[
          (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
        ]
    ): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: `21`): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionRequired(value: Boolean): Self = StObject.set(x, "selectionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRequiredUndefined: Self = StObject.set(x, "selectionRequired", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(
      value: ((RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K]))*
    ): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: LabelAccSelectionAffordanceBottom): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setVerticalGridVisible(value: auto | enabled | disabled): Self = StObject.set(x, "verticalGridVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalGridVisibleUndefined: Self = StObject.set(x, "verticalGridVisible", js.undefined)
  }
}
