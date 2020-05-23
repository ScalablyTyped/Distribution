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

trait IDetailsItemProps extends js.Object {
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
    * How much to indent
    */
  var indentWidth: js.UndefOr[Double] = js.undefined
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
  /**
    * Selection mode
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  /**
    * View port of the virtualized list
    *
    * @deprecated use rowWidth instead
    */
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object IDetailsItemProps {
  @scala.inline
  def apply(
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    columns: js.Array[IColumn] = null,
    groupNestingDepth: js.UndefOr[Double] = js.undefined,
    indentWidth: js.UndefOr[Double] = js.undefined,
    rowWidth: js.UndefOr[Double] = js.undefined,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    viewport: IViewport = null
  ): IDetailsItemProps = {
    val __obj = js.Dynamic.literal()
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(groupNestingDepth)) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWidth)) __obj.updateDynamic("indentWidth")(indentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowWidth)) __obj.updateDynamic("rowWidth")(rowWidth.get.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsItemProps]
  }
}

