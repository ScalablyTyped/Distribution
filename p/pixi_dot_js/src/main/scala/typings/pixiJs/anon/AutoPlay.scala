package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoPlay extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var crossorigin: js.UndefOr[Boolean] = js.undefined
  var updateFPS: js.UndefOr[Double] = js.undefined
}

object AutoPlay {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    crossorigin: js.UndefOr[Boolean] = js.undefined,
    updateFPS: js.UndefOr[Double] = js.undefined
  ): AutoPlay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossorigin)) __obj.updateDynamic("crossorigin")(crossorigin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateFPS)) __obj.updateDynamic("updateFPS")(updateFPS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPlay]
  }
}

