package typings.nodeWaves.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var position: js.UndefOr[X] = js.undefined
  @JSName("wait")
  var wait_FPosition: js.UndefOr[Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(position: X = null, wait: js.UndefOr[Double] = js.undefined): Position = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

