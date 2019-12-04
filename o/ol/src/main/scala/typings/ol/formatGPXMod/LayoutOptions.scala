package typings.ol.formatGPXMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.undefined
  var hasZ: js.UndefOr[Boolean] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply(hasM: js.UndefOr[Boolean] = js.undefined, hasZ: js.UndefOr[Boolean] = js.undefined): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
}

