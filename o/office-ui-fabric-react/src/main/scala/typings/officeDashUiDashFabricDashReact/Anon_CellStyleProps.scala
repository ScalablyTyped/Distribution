package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /** Are all columns collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
  /** Whether the "select all" checkbox is checked */
  var isAllSelected: js.UndefOr[Boolean] = js.undefined
  /** Whether checkbox is hidden  */
  var isCheckboxHidden: js.UndefOr[Boolean] = js.undefined
  /** Is column being resized */
  var isResizingColumn: js.UndefOr[Boolean] = js.undefined
  /** Whether to hide select all checkbox */
  var isSelectAllHidden: js.UndefOr[Boolean] = js.undefined
  /** Whether the header is sizing */
  var isSizing: js.UndefOr[Boolean] = js.undefined
}

object Anon_CellStyleProps {
  @scala.inline
  def apply(
    cellStyleProps: ICellStyleProps = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    isAllSelected: js.UndefOr[Boolean] = js.undefined,
    isCheckboxHidden: js.UndefOr[Boolean] = js.undefined,
    isResizingColumn: js.UndefOr[Boolean] = js.undefined,
    isSelectAllHidden: js.UndefOr[Boolean] = js.undefined,
    isSizing: js.UndefOr[Boolean] = js.undefined
  ): Anon_CellStyleProps = {
    val __obj = js.Dynamic.literal()
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed)
    if (!js.isUndefined(isAllSelected)) __obj.updateDynamic("isAllSelected")(isAllSelected)
    if (!js.isUndefined(isCheckboxHidden)) __obj.updateDynamic("isCheckboxHidden")(isCheckboxHidden)
    if (!js.isUndefined(isResizingColumn)) __obj.updateDynamic("isResizingColumn")(isResizingColumn)
    if (!js.isUndefined(isSelectAllHidden)) __obj.updateDynamic("isSelectAllHidden")(isSelectAllHidden)
    if (!js.isUndefined(isSizing)) __obj.updateDynamic("isSizing")(isSizing)
    __obj.asInstanceOf[Anon_CellStyleProps]
  }
}

