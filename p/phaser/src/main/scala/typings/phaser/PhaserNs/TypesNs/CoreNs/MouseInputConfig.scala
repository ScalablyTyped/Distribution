package typings.phaser.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseInputConfig extends js.Object {
  /**
    * Whether mouse input events have `preventDefault` called on them.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  /**
    * Where the Mouse Manager listens for mouse input events. The default is the game canvas.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object MouseInputConfig {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined, target: js.Any = null): MouseInputConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MouseInputConfig]
  }
}

