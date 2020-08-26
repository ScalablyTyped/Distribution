package typings.officeUiFabricReact.detailsRowTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsRowProps extends IDetailsRowBaseProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsRowProps: js.Array[IColumn] = js.native
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsRowProps: SelectionMode = js.native
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsRowProps: ISelection[IObjectWithKey] = js.native
}

object IDetailsRowProps {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode
  ): IDetailsRowProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowProps]
  }
  @scala.inline
  implicit class IDetailsRowPropsOps[Self <: IDetailsRowProps] (val x: Self) extends AnyVal {
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

