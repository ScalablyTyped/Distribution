package typings.pixiJs.anon

import typings.pixiJs.PIXI.SCALE_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleMode extends js.Object {
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
}

object ScaleMode {
  @scala.inline
  def apply(scaleMode: SCALE_MODES = null): ScaleMode = {
    val __obj = js.Dynamic.literal()
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMode]
  }
}

