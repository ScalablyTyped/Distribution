package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettings extends js.Object {
  var devtools: js.UndefOr[Boolean] = js.undefined
  var enable: Boolean
  var reload: js.UndefOr[Boolean] = js.undefined
}

object ContextMenuSettings {
  @scala.inline
  def apply(
    enable: Boolean,
    devtools: js.UndefOr[Boolean] = js.undefined,
    reload: js.UndefOr[Boolean] = js.undefined
  ): ContextMenuSettings = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettings]
  }
}

