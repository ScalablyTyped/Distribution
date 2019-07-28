package typings.popmotion.libInputListenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerOptions extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
}

object EventListenerOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined
  ): EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    __obj.asInstanceOf[EventListenerOptions]
  }
}

