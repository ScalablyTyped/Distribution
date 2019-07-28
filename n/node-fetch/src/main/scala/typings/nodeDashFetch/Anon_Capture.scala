package typings.nodeDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capture extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
}

object Anon_Capture {
  @scala.inline
  def apply(
    capture: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined
  ): Anon_Capture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    __obj.asInstanceOf[Anon_Capture]
  }
}

