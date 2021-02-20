package typings.muiDatatables.mod

import typings.muiDatatables.anon.PartialExpandButtonRender
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableProps extends StObject {
  
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  
  var components: js.UndefOr[PartialExpandButtonRender] = js.native
  
  var data: js.Array[js.Object | (js.Array[Double | String])] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var title: String | ReactNode = js.native
}
object MUIDataTableProps {
  
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef], data: js.Array[js.Object | (js.Array[Double | String])]): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableProps]
  }
  
  @scala.inline
  implicit class MUIDataTablePropsMutableBuilder[Self <: MUIDataTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: PartialExpandButtonRender): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
