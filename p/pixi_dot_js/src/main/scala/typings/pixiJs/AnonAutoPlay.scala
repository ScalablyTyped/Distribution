package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoPlay extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var crossorigin: js.UndefOr[Boolean] = js.undefined
  var updateFPS: js.UndefOr[Double] = js.undefined
}

object AnonAutoPlay {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    crossorigin: js.UndefOr[Boolean] = js.undefined,
    updateFPS: Int | Double = null
  ): AnonAutoPlay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(crossorigin)) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (updateFPS != null) __obj.updateDynamic("updateFPS")(updateFPS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoPlay]
  }
}

