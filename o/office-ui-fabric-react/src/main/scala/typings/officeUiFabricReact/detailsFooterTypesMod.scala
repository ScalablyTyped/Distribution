package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsFooterTypesMod {
  
  type IDetailsFooterBaseProps = IDetailsItemProps
  
  trait IDetailsFooterProps
    extends StObject
       with IDetailsItemProps {
    
    /**
      * Column metadata
      */
    @JSName("columns")
    var columns_IDetailsFooterProps: js.Array[IColumn]
    
    /**
      * Selection mode
      */
    @JSName("selectionMode")
    var selectionMode_IDetailsFooterProps: SelectionMode
    
    /**
      * Selection from utilities
      */
    @JSName("selection")
    var selection_IDetailsFooterProps: ISelection[IObjectWithKey]
  }
  object IDetailsFooterProps {
    
    inline def apply(columns: js.Array[IColumn], selection: ISelection[IObjectWithKey], selectionMode: SelectionMode): IDetailsFooterProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsFooterProps]
    }
    
    extension [Self <: IDetailsFooterProps](x: Self) {
      
      inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
}
