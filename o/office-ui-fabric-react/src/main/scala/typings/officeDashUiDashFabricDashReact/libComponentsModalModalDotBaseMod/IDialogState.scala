package typings.officeDashUiDashFabricDashReact.libComponentsModalModalDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogState extends js.Object {
  var hasBeenOpened: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isInKeyboardMoveMode: js.UndefOr[Boolean] = js.undefined
  var isModalMenuOpen: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var isVisibleClose: js.UndefOr[Boolean] = js.undefined
  var modalRectangleTop: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: Double
}

object IDialogState {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    hasBeenOpened: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isInKeyboardMoveMode: js.UndefOr[Boolean] = js.undefined,
    isModalMenuOpen: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    isVisibleClose: js.UndefOr[Boolean] = js.undefined,
    modalRectangleTop: Int | Double = null
  ): IDialogState = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (!js.isUndefined(hasBeenOpened)) __obj.updateDynamic("hasBeenOpened")(hasBeenOpened)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInKeyboardMoveMode)) __obj.updateDynamic("isInKeyboardMoveMode")(isInKeyboardMoveMode)
    if (!js.isUndefined(isModalMenuOpen)) __obj.updateDynamic("isModalMenuOpen")(isModalMenuOpen)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    if (!js.isUndefined(isVisibleClose)) __obj.updateDynamic("isVisibleClose")(isVisibleClose)
    if (modalRectangleTop != null) __obj.updateDynamic("modalRectangleTop")(modalRectangleTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogState]
  }
}

