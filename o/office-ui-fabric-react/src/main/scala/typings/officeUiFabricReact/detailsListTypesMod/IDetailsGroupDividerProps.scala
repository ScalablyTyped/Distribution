package typings.officeUiFabricReact.detailsListTypesMod

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps because var conflicts: indentWidth, selectionMode, viewport. Inlined columns, groupNestingDepth, selection, checkboxVisibility, cellStyleProps, rowWidth */ @js.native
trait IDetailsGroupDividerProps extends IGroupDividerProps {
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
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.native
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
}

object IDetailsGroupDividerProps {
  @scala.inline
  def apply(): IDetailsGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupDividerProps]
  }
  @scala.inline
  implicit class IDetailsGroupDividerPropsOps[Self <: IDetailsGroupDividerProps] (val x: Self) extends AnyVal {
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
    def setRowWidth(value: Double): Self = this.set("rowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowWidth: Self = this.set("rowWidth", js.undefined)
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
  
}

