package typings.officeUiFabricReact.detailsRowTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsItemProps extends js.Object {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.native
  /**
    * How much to indent
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.native
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  /**
    * Selection mode
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /**
    * View port of the virtualized list
    *
    * @deprecated use rowWidth instead
    */
  var viewport: js.UndefOr[IViewport] = js.native
}

object IDetailsItemProps {
  @scala.inline
  def apply(): IDetailsItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsItemProps]
  }
  @scala.inline
  implicit class IDetailsItemPropsOps[Self <: IDetailsItemProps] (val x: Self) extends AnyVal {
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
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    @scala.inline
    def setCheckboxVisibility(value: CheckboxVisibility): Self = this.set("checkboxVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxVisibility: Self = this.set("checkboxVisibility", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setGroupNestingDepth(value: Double): Self = this.set("groupNestingDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupNestingDepth: Self = this.set("groupNestingDepth", js.undefined)
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    @scala.inline
    def setRowWidth(value: Double): Self = this.set("rowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowWidth: Self = this.set("rowWidth", js.undefined)
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setViewport(value: IViewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

