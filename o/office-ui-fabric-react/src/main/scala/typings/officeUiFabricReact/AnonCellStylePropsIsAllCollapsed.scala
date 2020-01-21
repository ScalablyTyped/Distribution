package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellStylePropsIsAllCollapsed extends js.Object {
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

object AnonCellStylePropsIsAllCollapsed {
  @scala.inline
  def apply(
    cellStyleProps: ICellStyleProps = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    isAllSelected: js.UndefOr[Boolean] = js.undefined,
    isCheckboxHidden: js.UndefOr[Boolean] = js.undefined,
    isResizingColumn: js.UndefOr[Boolean] = js.undefined,
    isSelectAllHidden: js.UndefOr[Boolean] = js.undefined,
    isSizing: js.UndefOr[Boolean] = js.undefined
  ): AnonCellStylePropsIsAllCollapsed = {
    val __obj = js.Dynamic.literal()
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllSelected)) __obj.updateDynamic("isAllSelected")(isAllSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheckboxHidden)) __obj.updateDynamic("isCheckboxHidden")(isCheckboxHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizingColumn)) __obj.updateDynamic("isResizingColumn")(isResizingColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectAllHidden)) __obj.updateDynamic("isSelectAllHidden")(isSelectAllHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isSizing)) __obj.updateDynamic("isSizing")(isSizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellStylePropsIsAllCollapsed]
  }
}

