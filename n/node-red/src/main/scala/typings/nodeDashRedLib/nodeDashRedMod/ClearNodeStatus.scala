package typings
package nodeDashRedLib.nodeDashRedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearNodeStatus extends js.Object {
  var fill: js.UndefOr[scala.Nothing] = js.undefined
  var shape: js.UndefOr[scala.Nothing] = js.undefined
  var text: js.UndefOr[scala.Nothing] = js.undefined
}

object ClearNodeStatus {
  @scala.inline
  def apply(
    fill: js.UndefOr[scala.Nothing] = js.undefined,
    shape: js.UndefOr[scala.Nothing] = js.undefined,
    text: js.UndefOr[scala.Nothing] = js.undefined
  ): ClearNodeStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(shape)) __obj.updateDynamic("shape")(shape)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ClearNodeStatus]
  }
}

