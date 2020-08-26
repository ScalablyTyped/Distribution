package typings.officeUiFabricReact.detailsFooterTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsFooterProps extends IDetailsItemProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsFooterProps: js.Array[IColumn] = js.native
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsFooterProps: SelectionMode = js.native
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsFooterProps: ISelection[IObjectWithKey] = js.native
}

object IDetailsFooterProps {
  @scala.inline
  def apply(columns: js.Array[IColumn], selection: ISelection[IObjectWithKey], selectionMode: SelectionMode): IDetailsFooterProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsFooterProps]
  }
  @scala.inline
  implicit class IDetailsFooterPropsOps[Self <: IDetailsFooterProps] (val x: Self) extends AnyVal {
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

