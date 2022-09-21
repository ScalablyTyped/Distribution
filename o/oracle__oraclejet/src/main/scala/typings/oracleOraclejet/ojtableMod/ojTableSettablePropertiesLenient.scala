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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtable.ojTableSettableProperties<K, D>> */
trait ojTableSettablePropertiesLenient[K, D]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var accessibility: js.UndefOr[RowHeader] = js.undefined
  
  var as: js.UndefOr[String] = js.undefined
  
  var columns: js.UndefOr[(js.Array[Field[K, D]]) | Null] = js.undefined
  
  var columnsDefault: js.UndefOr[FooterClassName[K, D]] = js.undefined
  
  var currentRow: js.UndefOr[CurrentRow[K] | Null] = js.undefined
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.undefined
  
  var display: js.UndefOr[list | grid] = js.undefined
  
  var dnd: js.UndefOr[DropReorder[K, D]] = js.undefined
  
  var editMode: js.UndefOr[none | rowEdit] = js.undefined
  
  var firstSelectedRow: js.UndefOr[js.Object] = js.undefined
  
  var horizontalGridVisible: js.UndefOr[auto | enabled | disabled] = js.undefined
  
  var rowRenderer: js.UndefOr[
    (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  ] = js.undefined
  
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll] = js.undefined
  
  var scrollPolicyOptions: js.UndefOr[MaxCount] = js.undefined
  
  var scrollPosition: js.UndefOr[ColumnKey] = js.undefined
  
  var selection: js.UndefOr[
    js.Array[
      (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
    ]
  ] = js.undefined
  
  var selectionMode: js.UndefOr[`21`] = js.undefined
  
  var selectionRequired: js.UndefOr[Boolean] = js.undefined
  
  var translations: js.UndefOr[LabelAccSelectionAffordanceBottom] = js.undefined
  
  var verticalGridVisible: js.UndefOr[auto | enabled | disabled] = js.undefined
}
object ojTableSettablePropertiesLenient {
  
  inline def apply[K, D](): ojTableSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTableSettablePropertiesLenient[K, D]]
  }
  
  extension [Self <: ojTableSettablePropertiesLenient[?, ?], K, D](x: Self & (ojTableSettablePropertiesLenient[K, D])) {
    
    inline def setAccessibility(value: RowHeader): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setColumns(value: js.Array[Field[K, D]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsDefault(value: FooterClassName[K, D]): Self = StObject.set(x, "columnsDefault", value.asInstanceOf[js.Any])
    
    inline def setColumnsDefaultUndefined: Self = StObject.set(x, "columnsDefault", js.undefined)
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (Field[K, D])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCurrentRow(value: CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
    
    inline def setCurrentRowNull: Self = StObject.set(x, "currentRow", null)
    
    inline def setCurrentRowUndefined: Self = StObject.set(x, "currentRow", js.undefined)
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisplay(value: list | grid): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDnd(value: DropReorder[K, D]): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    inline def setEditMode(value: none | rowEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
    
    inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
    
    inline def setFirstSelectedRow(value: js.Object): Self = StObject.set(x, "firstSelectedRow", value.asInstanceOf[js.Any])
    
    inline def setFirstSelectedRowUndefined: Self = StObject.set(x, "firstSelectedRow", js.undefined)
    
    inline def setHorizontalGridVisible(value: auto | enabled | disabled): Self = StObject.set(x, "horizontalGridVisible", value.asInstanceOf[js.Any])
    
    inline def setHorizontalGridVisibleUndefined: Self = StObject.set(x, "horizontalGridVisible", js.undefined)
    
    inline def setRowRenderer(value: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    inline def setRowRendererNull: Self = StObject.set(x, "rowRenderer", null)
    
    inline def setRowRendererUndefined: Self = StObject.set(x, "rowRenderer", js.undefined)
    
    inline def setScrollPolicy(value: auto | loadMoreOnScroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
    
    inline def setScrollPolicyOptions(value: MaxCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
    
    inline def setScrollPolicyOptionsUndefined: Self = StObject.set(x, "scrollPolicyOptions", js.undefined)
    
    inline def setScrollPolicyUndefined: Self = StObject.set(x, "scrollPolicy", js.undefined)
    
    inline def setScrollPosition(value: ColumnKey): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
    
    inline def setSelection(
      value: js.Array[
          (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
        ]
    ): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: `21`): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionRequired(value: Boolean): Self = StObject.set(x, "selectionRequired", value.asInstanceOf[js.Any])
    
    inline def setSelectionRequiredUndefined: Self = StObject.set(x, "selectionRequired", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(
      value: ((RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K]))*
    ): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setTranslations(value: LabelAccSelectionAffordanceBottom): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setVerticalGridVisible(value: auto | enabled | disabled): Self = StObject.set(x, "verticalGridVisible", value.asInstanceOf[js.Any])
    
    inline def setVerticalGridVisibleUndefined: Self = StObject.set(x, "verticalGridVisible", js.undefined)
  }
}
