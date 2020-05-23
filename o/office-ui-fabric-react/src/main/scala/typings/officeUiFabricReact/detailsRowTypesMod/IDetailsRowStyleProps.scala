package typings.officeUiFabricReact.detailsRowTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps, 'theme'>> & {  isSelected ? :boolean,   anySelected ? :boolean,   canSelect ? :boolean,   droppingClassName ? :string,   isCheckVisible ? :boolean,   isRowHeader ? :boolean,   checkboxCellClassName ? :string,   className ? :string,   compact ? :boolean,   cellStyleProps ? :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps,   enableUpdateAnimations ? :boolean} */
trait IDetailsRowStyleProps extends js.Object {
  /** Whether there are any rows in the list selected */
  var anySelected: js.UndefOr[Boolean] = js.undefined
  /** Whether this row can be selected */
  var canSelect: js.UndefOr[Boolean] = js.undefined
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /** A class name from the checkbox cell, so proper styling can be targeted */
  var checkboxCellClassName: js.UndefOr[String] = js.undefined
  /** CSS class name for the component */
  var className: js.UndefOr[String] = js.undefined
  /** Is list in compact mode */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Class name of when this becomes a drop target. */
  var droppingClassName: js.UndefOr[String] = js.undefined
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  /** Is the checkbox visible */
  var isCheckVisible: js.UndefOr[Boolean] = js.undefined
  /** Is this a row header */
  var isRowHeader: js.UndefOr[Boolean] = js.undefined
  /** Whether the row is selected  */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IDetailsRowStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    anySelected: js.UndefOr[Boolean] = js.undefined,
    canSelect: js.UndefOr[Boolean] = js.undefined,
    cellStyleProps: ICellStyleProps = null,
    checkboxCellClassName: String = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    droppingClassName: String = null,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    isCheckVisible: js.UndefOr[Boolean] = js.undefined,
    isRowHeader: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): IDetailsRowStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(anySelected)) __obj.updateDynamic("anySelected")(anySelected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canSelect)) __obj.updateDynamic("canSelect")(canSelect.get.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (droppingClassName != null) __obj.updateDynamic("droppingClassName")(droppingClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheckVisible)) __obj.updateDynamic("isCheckVisible")(isCheckVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowHeader)) __obj.updateDynamic("isRowHeader")(isRowHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowStyleProps]
  }
}

