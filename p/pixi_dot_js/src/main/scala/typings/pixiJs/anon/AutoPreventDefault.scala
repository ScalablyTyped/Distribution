package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoPreventDefault extends js.Object {
  var autoPreventDefault: js.UndefOr[Boolean] = js.undefined
  var interactionFrequency: js.UndefOr[Double] = js.undefined
  var useSystemTicker: js.UndefOr[Double] = js.undefined
}

object AutoPreventDefault {
  @scala.inline
  def apply(
    autoPreventDefault: js.UndefOr[Boolean] = js.undefined,
    interactionFrequency: js.UndefOr[Double] = js.undefined,
    useSystemTicker: js.UndefOr[Double] = js.undefined
  ): AutoPreventDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPreventDefault)) __obj.updateDynamic("autoPreventDefault")(autoPreventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interactionFrequency)) __obj.updateDynamic("interactionFrequency")(interactionFrequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useSystemTicker)) __obj.updateDynamic("useSystemTicker")(useSystemTicker.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPreventDefault]
  }
}

