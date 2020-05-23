package typings.officeUiFabricReact.modalBaseMod

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
    modalRectangleTop: js.UndefOr[Double] = js.undefined
  ): IDialogState = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBeenOpened)) __obj.updateDynamic("hasBeenOpened")(hasBeenOpened.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInKeyboardMoveMode)) __obj.updateDynamic("isInKeyboardMoveMode")(isInKeyboardMoveMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isModalMenuOpen)) __obj.updateDynamic("isModalMenuOpen")(isModalMenuOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisibleClose)) __obj.updateDynamic("isVisibleClose")(isVisibleClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modalRectangleTop)) __obj.updateDynamic("modalRectangleTop")(modalRectangleTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogState]
  }
}

