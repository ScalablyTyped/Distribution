package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.anon.kinkeyofPickIDetailsRowSt
import typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDetailsListDetailsRowFieldsDottypesMod {
  
  trait IDetailsRowFieldsProps
    extends StObject
       with IOverrideColumnRenderProps {
    
    /**
      * Style properties to customize cell render output.
      */
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
    
    /**
      * Index to start for the column
      */
    var columnStartIndex: Double
    
    /**
      * Columns metadata
      */
    var columns: js.Array[IColumn]
    
    /**
      * whether to render as a compact field
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Data source for this component
      */
    var item: Any
    
    /**
      * The item index of the collection for the DetailsList
      */
    var itemIndex: Double
    
    /**
      * Subset of classnames currently generated in DetailsRow that are used within DetailsRowFields.
      */
    var rowClassNames: kinkeyofPickIDetailsRowSt
    
    /**
      * Id for the current row's row-header
      */
    var rowHeaderId: js.UndefOr[String] = js.undefined
  }
  object IDetailsRowFieldsProps {
    
    inline def apply(
      columnStartIndex: Double,
      columns: js.Array[IColumn],
      item: Any,
      itemIndex: Double,
      rowClassNames: kinkeyofPickIDetailsRowSt
    ): IDetailsRowFieldsProps = {
      val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowFieldsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDetailsRowFieldsProps] (val x: Self) extends AnyVal {
      
      inline def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      inline def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      inline def setColumnStartIndex(value: Double): Self = StObject.set(x, "columnStartIndex", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
      
      inline def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setRowClassNames(value: kinkeyofPickIDetailsRowSt): Self = StObject.set(x, "rowClassNames", value.asInstanceOf[js.Any])
      
      inline def setRowHeaderId(value: String): Self = StObject.set(x, "rowHeaderId", value.asInstanceOf[js.Any])
      
      inline def setRowHeaderIdUndefined: Self = StObject.set(x, "rowHeaderId", js.undefined)
    }
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.IDetailsRowProps, 'cellsByColumn'> */
  trait IOverrideColumnRenderProps extends StObject {
    
    var cellsByColumn: js.UndefOr[StringDictionary[ReactNode]] = js.undefined
    
    var getCellValueKey: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[Any], 
          /* index */ js.UndefOr[Double], 
          /* column */ js.UndefOr[IColumn], 
          String
        ]
      ] = js.undefined
    
    var onRenderItemColumn: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[Any], 
          /* index */ js.UndefOr[Double], 
          /* column */ js.UndefOr[IColumn], 
          ReactNode
        ]
      ] = js.undefined
  }
  object IOverrideColumnRenderProps {
    
    inline def apply(): IOverrideColumnRenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverrideColumnRenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOverrideColumnRenderProps] (val x: Self) extends AnyVal {
      
      inline def setCellsByColumn(value: StringDictionary[ReactNode]): Self = StObject.set(x, "cellsByColumn", value.asInstanceOf[js.Any])
      
      inline def setCellsByColumnUndefined: Self = StObject.set(x, "cellsByColumn", js.undefined)
      
      inline def setGetCellValueKey(
        value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
      ): Self = StObject.set(x, "getCellValueKey", js.Any.fromFunction3(value))
      
      inline def setGetCellValueKeyUndefined: Self = StObject.set(x, "getCellValueKey", js.undefined)
      
      inline def setOnRenderItemColumn(
        value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode
      ): Self = StObject.set(x, "onRenderItemColumn", js.Any.fromFunction3(value))
      
      inline def setOnRenderItemColumnUndefined: Self = StObject.set(x, "onRenderItemColumn", js.undefined)
    }
  }
}
