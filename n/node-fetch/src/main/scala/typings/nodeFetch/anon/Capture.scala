package typings.nodeFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capture extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
}

object Capture {
  @scala.inline
  def apply(
    capture: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined
  ): Capture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capture]
  }
}

