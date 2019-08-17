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
    if (!js.isUndefined(anySelected)) __obj.updateDynamic("anySelected")(anySelected)
    if (!js.isUndefined(canSelect)) __obj.updateDynamic("canSelect")(canSelect)
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps)
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (droppingClassName != null) __obj.updateDynamic("droppingClassName")(droppingClassName)
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations)
    if (!js.isUndefined(isCheckVisible)) __obj.updateDynamic("isCheckVisible")(isCheckVisible)
    if (!js.isUndefined(isRowHeader)) __obj.updateDynamic("isRowHeader")(isRowHeader)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[Anon_AnySelected]
  }
}

