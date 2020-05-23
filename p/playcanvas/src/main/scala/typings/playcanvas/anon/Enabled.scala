package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var ind: js.UndefOr[Double] = js.undefined
  var preloading: js.UndefOr[Boolean] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    ind: js.UndefOr[Double] = js.undefined,
    preloading: js.UndefOr[Boolean] = js.undefined
  ): Enabled = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ind)) __obj.updateDynamic("ind")(ind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preloading)) __obj.updateDynamic("preloading")(preloading.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

