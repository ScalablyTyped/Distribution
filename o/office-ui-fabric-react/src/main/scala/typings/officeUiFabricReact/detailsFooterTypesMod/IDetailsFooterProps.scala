package typings.officeUiFabricReact.detailsFooterTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsFooterProps extends IDetailsItemProps {
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
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    groupNestingDepth: js.UndefOr[Double] = js.undefined,
    indentWidth: js.UndefOr[Double] = js.undefined,
    rowWidth: js.UndefOr[Double] = js.undefined,
    viewport: IViewport = null
  ): IDetailsFooterProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(groupNestingDepth)) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWidth)) __obj.updateDynamic("indentWidth")(indentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowWidth)) __obj.updateDynamic("rowWidth")(rowWidth.get.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsFooterProps]
  }
}

