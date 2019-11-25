package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasBeenOpened extends js.Object {
  /** Modal has been opened state. */
  var hasBeenOpened: js.UndefOr[Boolean] = js.undefined
  /** Whether this modal is draggable and using the default handler */
  var isDefaultDragHandle: js.UndefOr[Boolean] = js.undefined
  /** Modal open state. */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /** Modal visible state. */
  var isVisible: js.UndefOr[Boolean] = js.undefined
  /** Classname for layer element */
  var layerClassName: js.UndefOr[String] = js.undefined
  /** Positioning of modal on first render */
  var modalRectangleTop: js.UndefOr[Double] = js.undefined
}

object Anon_HasBeenOpened {
  @scala.inline
  def apply(
    hasBeenOpened: js.UndefOr[Boolean] = js.undefined,
    isDefaultDragHandle: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    layerClassName: String = null,
    modalRectangleTop: Int | Double = null
  ): Anon_HasBeenOpened = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasBeenOpened)) __obj.updateDynamic("hasBeenOpened")(hasBeenOpened.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultDragHandle)) __obj.updateDynamic("isDefaultDragHandle")(isDefaultDragHandle.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (layerClassName != null) __obj.updateDynamic("layerClassName")(layerClassName.asInstanceOf[js.Any])
    if (modalRectangleTop != null) __obj.updateDynamic("modalRectangleTop")(modalRectangleTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HasBeenOpened]
  }
}

