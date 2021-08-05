package typings.muiDatatables.mod

import typings.muiDatatables.anon.PartialExpandButtonRender
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableProps extends StObject {
  
  var columns: js.Array[MUIDataTableColumnDef]
  
  var components: js.UndefOr[PartialExpandButtonRender] = js.undefined
  
  var data: js.Array[js.Object | (js.Array[Double | String])]
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var title: String | ReactNode
}
object MUIDataTableProps {
  
  inline def apply(columns: js.Array[MUIDataTableColumnDef], data: js.Array[js.Object | (js.Array[Double | String])]): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableProps]
  }
  
  extension [Self <: MUIDataTableProps](x: Self) {
    
    inline def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setComponents(value: PartialExpandButtonRender): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
