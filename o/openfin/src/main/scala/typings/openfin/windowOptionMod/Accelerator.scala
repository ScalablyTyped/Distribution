package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accelerator extends js.Object {
  var devtools: js.UndefOr[Boolean] = js.undefined
  var reload: js.UndefOr[Boolean] = js.undefined
  var reloadIgnoringCache: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Boolean] = js.undefined
}

object Accelerator {
  @scala.inline
  def apply(
    devtools: js.UndefOr[Boolean] = js.undefined,
    reload: js.UndefOr[Boolean] = js.undefined,
    reloadIgnoringCache: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Boolean] = js.undefined
  ): Accelerator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadIgnoringCache)) __obj.updateDynamic("reloadIgnoringCache")(reloadIgnoringCache.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accelerator]
  }
}

