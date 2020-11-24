package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsHeaderProps extends IDetailsHeaderBaseProps {
  
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsHeaderProps: js.Array[IColumn] = js.native
  
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsHeaderProps: SelectionMode = js.native
  
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsHeaderProps: ISelection[IObjectWithKey] = js.native
}
object IDetailsHeaderProps {
  
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    layoutMode: DetailsListLayoutMode,
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode
  ): IDetailsHeaderProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderProps]
  }
  
  @scala.inline
  implicit class IDetailsHeaderPropsOps[Self <: IDetailsHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
  }
}
