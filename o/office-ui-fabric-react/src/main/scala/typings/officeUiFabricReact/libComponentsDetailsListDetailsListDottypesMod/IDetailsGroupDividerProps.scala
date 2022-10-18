package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupDividerProps
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsItemProps because var conflicts: indentWidth, selectionMode, viewport. Inlined columns, groupNestingDepth, selection, checkboxVisibility, cellStyleProps, rowWidth */ trait IDetailsGroupDividerProps
  extends StObject
     with IGroupDividerProps {
  
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.undefined
}
object IDetailsGroupDividerProps {
  
  inline def apply(): IDetailsGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupDividerProps]
  }
  
  extension [Self <: IDetailsGroupDividerProps](x: Self) {
    
    inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
    
    inline def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
    
    inline def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
    
    inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setGroupNestingDepth(value: Double): Self = StObject.set(x, "groupNestingDepth", value.asInstanceOf[js.Any])
    
    inline def setGroupNestingDepthUndefined: Self = StObject.set(x, "groupNestingDepth", js.undefined)
    
    inline def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
    
    inline def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
    
    inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
