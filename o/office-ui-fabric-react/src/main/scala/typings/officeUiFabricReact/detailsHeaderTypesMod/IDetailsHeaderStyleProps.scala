package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'className'> & {  isSelectAllHidden ? :boolean,   isAllSelected ? :boolean,   isResizingColumn ? :boolean,   isAllCollapsed ? :boolean,   isSizing ? :boolean,   isCheckboxHidden ? :boolean,   cellStyleProps ? :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps} */
trait IDetailsHeaderStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
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
  var theme: ITheme
}

object IDetailsHeaderStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    cellStyleProps: ICellStyleProps = null,
    className: String = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    isAllSelected: js.UndefOr[Boolean] = js.undefined,
    isCheckboxHidden: js.UndefOr[Boolean] = js.undefined,
    isResizingColumn: js.UndefOr[Boolean] = js.undefined,
    isSelectAllHidden: js.UndefOr[Boolean] = js.undefined,
    isSizing: js.UndefOr[Boolean] = js.undefined
  ): IDetailsHeaderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllSelected)) __obj.updateDynamic("isAllSelected")(isAllSelected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheckboxHidden)) __obj.updateDynamic("isCheckboxHidden")(isCheckboxHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizingColumn)) __obj.updateDynamic("isResizingColumn")(isResizingColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectAllHidden)) __obj.updateDynamic("isSelectAllHidden")(isSelectAllHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSizing)) __obj.updateDynamic("isSizing")(isSizing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderStyleProps]
  }
}

