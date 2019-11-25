package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnySelected extends js.Object {
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
}

object Anon_AnySelected {
  @scala.inline
  def apply(
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
  ): Anon_AnySelected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anySelected)) __obj.updateDynamic("anySelected")(anySelected.asInstanceOf[js.Any])
    if (!js.isUndefined(canSelect)) __obj.updateDynamic("canSelect")(canSelect.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (droppingClassName != null) __obj.updateDynamic("droppingClassName")(droppingClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheckVisible)) __obj.updateDynamic("isCheckVisible")(isCheckVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowHeader)) __obj.updateDynamic("isRowHeader")(isRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnySelected]
  }
}

